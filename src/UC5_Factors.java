import java.util.Scanner;

public class UC5_Factors {
       public static void main(String args[])
     {
       int number=120;
     if(number <= 1)
            return;

    for(int divisor=2; divisor*divisor<=number; divisor++)
    {
      while(number % divisor == 0)
     {
       System.out.print(divisor+" ");

     number = number / divisor;
    }
     }

    if(number > 1)
      System.out.print(number+" ");

    System.out.println();

     }
}

