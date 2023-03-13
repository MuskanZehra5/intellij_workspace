import java.util.Scanner;

//add two integers
public class q2 {

   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter First Number ; ");
       int x = input.nextInt();

       System.out.println("Enter Second Number ; ");
       int y = input.nextInt();

       int sum = x + y;
       System.out.println("Sum is : " + sum);

   }

}
