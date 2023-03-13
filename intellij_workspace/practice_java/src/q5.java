import java.util.Scanner;

//compute quotient and remainder
public class q5 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int divi = input.nextInt();

        System.out.println("Enter Divisor : ");
        int divisor = input.nextInt();

        if (divisor>divi)
        {
            System.out.println("Quotient and Remainder can not be computed : ");
        }

        else
        {
            int quo = divi / divisor;
            int rem = divi % divisor;

            System.out.println("Quotient : "+ quo + "\nRemainder : "+rem);
        }

    }
}
