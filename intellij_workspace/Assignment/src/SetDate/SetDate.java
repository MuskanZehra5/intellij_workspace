package SetDate;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {


    public static void setDate(String date, String time, String fileName) throws IllegalArgumentException {


        int day, month, year, hour, minute, second;
        try {

            String[] dpartition = date.split("/");

            month = Integer.parseInt(dpartition[0]);
            day = Integer.parseInt(dpartition[1]);
            year = Integer.parseInt(dpartition[2]);

            String[] tpartition = time.split(":");
            hour = Integer.parseInt(tpartition[0]);
            minute = Integer.parseInt(tpartition[1]);
            second = Integer.parseInt(tpartition[2]);


            try {

                File file = new File(fileName);
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


                long l = file.lastModified();
                System.out.println("Original Last Modified Date : " + sdf.format(l));

                Date newDate = new Date(year - 1900, month - 1, day, hour, minute, second);

                System.out.println(newDate);

                file.setLastModified(newDate.getTime());

                System.out.println("Latest Last Modified Date : " + sdf.format((file.lastModified())));
            } catch (IllegalArgumentException e) {
                System.out.println("File does not exist " + fileName);
                e.printStackTrace();
            }

        } catch (NumberFormatException e) {
            System.out.println("Datetime format incorrect ");
        }

    }


    public static void main(String args[]) {
        String date;
        String time;
        String filename;

        int len = args.length;

        if (len < 3) {
            System.out.println("Arguments are less than 3 ");
        }

        else if (len == 3) {
            date = args[0];
            time = args[1];
            filename = args[2];

            try {

                if (time.matches("(0[0-9]|[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
                    System.out.println("Valid Time");

                    String datepattern = "([1-9]|1[0-2])\\/([1-9]|[12][0-9]|3[01])\\/([0-9]{4})";
                    if (date.matches(datepattern)) {
                        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                        dateFormat.setLenient(false);
                        try {
                            dateFormat.parse(date);
                            System.out.println("Valid Date");
                            setDate(date, time, filename);
                        } catch (Exception e) {
                            System.out.println("Exception Invalid Date");
                        }
                    } else
                        System.out.println("Invalid Date");

                } else
                    System.out.println("Invalid Time");


            } catch (Exception e) {

            }

        }
        else {
            System.out.println("Argument size greater than 3");

            date = args[0];
            time = args[1];
            filename = args[2];


            try {

                if (time.matches("(0[0-9]|[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
                    System.out.println("Valid Time");

                    String datepattern = "([1-9]|1[0-2])\\/([1-9]|[12][0-9]|3[01])\\/([0-9]{4})";
                    if (date.matches(datepattern)) {
                        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                        dateFormat.setLenient(false);
                        try {
                            dateFormat.parse(date);
                            System.out.println("Valid Date");
                            setDate(date, time, filename);
                        } catch (Exception e) {
                            System.out.println("Exception Invalid Date");
                        }
                    } else
                        System.out.println("Invalid Date");

                } else
                    System.out.println("Invalid Time");


            } catch (Exception e) {

            }
        }
    }
}
