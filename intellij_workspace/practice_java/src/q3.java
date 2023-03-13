
import java.util.Scanner;

// multiply two floating point numbers
public class q3 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        float x = input.nextFloat();
        System.out.println("Enter 2nd Number ; ");
        float y = input.nextFloat();

        double prod = x * y;
        System.out.println("The Product of Two float Numbers is : " + prod);


    }
}
