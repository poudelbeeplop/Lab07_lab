import java.util.Scanner;

public class C_to_F_converter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double cVal = 0.0;
        double  fVal = 0.0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Enter the value in Celsius: ");
            if (in.hasNextDouble())
            {
                cVal = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                in.next();
                System.out.println("You must enter a vlaid double not: " + trash);
            }

        } while (!done);

        fVal = (cVal * 1.8) + 32;
        System.out.printf("The value for %5.2f is %5.2f", cVal, fVal);

    }
}
