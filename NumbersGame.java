import java.util.Scanner;

public class NumbersGame
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int num = 1 + (int)(100 * Math.random());
        
        int i,GuessValue,NumberOfTrials = 3;

        System.out.println("A Number choose between 1 to 100, Guess the number within "+NumberOfTrials+" trials.");
        System.out.println();

        for( i = 0; i < NumberOfTrials; i++ )
        {
            System.out.print("Guess the Number : ");

            GuessValue = scan.nextInt();

            if ( num == GuessValue )
            {
                System.out.println("Congrats! You Guessed the Number.");

                break;
            }

            else if ( num > GuessValue && i != GuessValue - 1 )

            System.out.println("The Number is Greater than "+GuessValue);

            else if ( num < GuessValue && i != GuessValue - 1 )

            System.out.println("The Number is Less than "+GuessValue);
        }

        if( NumberOfTrials == i )
        {
            System.out.println("You have Exhausted all the "+NumberOfTrials+" trials.");

            System.out.println("The Number was "+num);
        }
    }
}