package TCP;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

class client {

    public static void main(String[] args)
    {

        try (Socket socket = new Socket("localhost", 4040)) {

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

           BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            String line = "";
            System.out.println("Client "+socket.getInetAddress().getHostAddress()+" is active.”");

            while (!"exit".equalsIgnoreCase(line)) {

                System.out.println("1) Save data on server \n2) Read data from server");
                Integer x = sc.nextInt();

                if (x == 1 )
                {
                    line ="";
                    System.out.println("Save data on server\nwrite some Information : ");

                    // reading from user
                    line += sc.next() + " ";
                    // sending the user input to server
                    out.println(line);
                    out.flush();
                }

                else if (x == 2)
                {
                    // displaying server reply

                    out.println(line);
                    out.flush();


                    String inp =in.readLine();
                    System.out.println("Server replied from file " + inp);


                    try {
                        String y = String.valueOf(socket.getLocalSocketAddress());
                        String pno = y.substring(11,16);
                        String fname = y.substring(1,10)+"_"+pno+".txt";

                        File myObj = new File(fname);
                        if (myObj.createNewFile()) {
                            System.out.println("File created: " + myObj.getName());
                        } else {
                            System.out.println("File already exists.");
                        }

                        Path file = Path.of(fname);
                        Files.writeString(file,inp, StandardOpenOption.APPEND);

                        line = line.replace("read"," ");

                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                else
                {
                    System.out.println("Invalid Input ");
                }
                line = "read";
            }

            // closing the scanner object
            sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
