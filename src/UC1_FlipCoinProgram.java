import java.util.Scanner;

public class UC1_FlipCoinProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time we want to flip the coins");
        int numOffFlips = sc.nextInt();
        int tailCount = 0;
        int headCount = 0;
        for( int i = 1 ; i <= numOffFlips ; i++ )
        {
            double random = Math.random();
            if (random< 0.5)
            {
                tailCount++;
            }
            else
            {
                headCount++;
            }
        }
        System.out.println("percentage of tails (" + tailCount + "): " + (tailCount * 100.0 / (headCount + tailCount)) );
        System.out.println("percentage of heads (" + headCount + "): : " + (headCount * 100.0 / (headCount + tailCount)) );
    }
}
