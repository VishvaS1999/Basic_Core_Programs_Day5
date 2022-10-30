import java.util.Scanner;

public class UC6_Compute_Quotient_Remainder
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Value Of Num1 and Num2");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = 0, remainder = 0;

        quotient = num1/num2;

        remainder = num1 % num2;

       // System.out.println("Quotient" + num1 + "/" + num2 +"is:" +quotient);

       // System.out.println("Remainder" + num1 + "%" + num2 + "is:" +remainder);
        System.out.println("Quotient " + num1 + "/" + num2 + " is: "   + quotient);
        System.out.println("Remainder " + num1 + " % " + num2 + " is: " + remainder);
    }

}
