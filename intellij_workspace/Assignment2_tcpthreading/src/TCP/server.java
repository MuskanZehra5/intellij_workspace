package TCP;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

// Server class
class server {

    public static void main(String[] args)
    {
        ServerSocket server = null;

        try {

            server = new ServerSocket(4040);
            server.setReuseAddress(true);
            System.out.println("Waiting for clients on port "+server.getLocalPort());
            int counter = 0;

            while (true) {
                counter++;
                System.out.println(server.getInetAddress());
                Socket client = server.accept();
                String addr = String.valueOf(client.getLocalSocketAddress());
                String port = String.valueOf(client.getPort());
                        System.out.println("Got connection from "+addr+" : Client port = "+port);

                        System.out.println("Active Connections = "+ counter);


                ClientHandler clientSock = new ClientHandler(client,server);

                new Thread(clientSock).start();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (server != null) {
                try {
                    server.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // ClientHandler class
    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;
        private ServerSocket serversocket;

        // Constructor
        public ClientHandler(Socket socket, ServerSocket serv)
        {
            this.clientSocket = socket;
            this.serversocket = serv;
        }


        public void run()
        {
            String servadd = String.valueOf(serversocket.getInetAddress());
            System.out.println("Welcome to the server " + servadd);
            PrintWriter out = null;
            BufferedReader in = null;
            try {

                // get the outputstream of client
                out = new PrintWriter(
                        clientSocket.getOutputStream(), true);

                // get the inputstream of client
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String line;

                String serv_port = String.valueOf(serversocket.getLocalPort());
                String serv_addr = servadd.substring(0,7)+"_"+servadd.substring(8,15);
                String total_addr = serv_addr+"_"+serv_port+".txt";

                while ((line = in.readLine()) != null)  {
                    if (line.contains("read"))
                    {

                        try {

                            File myObj = new File(total_addr);

                            if(myObj.exists())
                            {

                                System.out.println("“Information for client "+clientSocket.getInetAddress().getHostAddress());
                            Path file = Path.of(total_addr);
                            String s = Files.readString(file);
                            line = s.replace("read"," ");

                            }

                            else
                            {
                                System.out.println("“No Information found for client "+clientSocket.getInetAddress().getHostAddress());
                            }

                        } catch (FileNotFoundException e) {
                            System.out.println("An error occurred while reading a file");
                            e.printStackTrace();
                        }
                    }

                    else {
                        try {
                            File myObj = new File(total_addr);
                            if (myObj.createNewFile()) {
                                System.out.println("File created: " + myObj.getName());
                            } else {
                                System.out.println("File already exists.");
                            }

                            Path file = Path.of(total_addr);
                             Files.writeString(file, line, StandardOpenOption.APPEND);

                            line = line.replace("read"," ");

                                System.out.println("Information saved for client "+ clientSocket.getInetAddress());
                        }
                        catch (IOException e) {
                            System.out.println("An error occurred while creating a file");
                            e.printStackTrace();
                        }
                    }
                    // writing the received message from
                    // client
                    System.out.printf("Sent from the client: %s\n", line);
                    out.println(line);

                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if (out != null) {
                        out.close();
                    }
                    if (in != null) {
                        in.close();
                        clientSocket.close();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
