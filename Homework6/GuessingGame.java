/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   9/29/2017
 ******************************************************************************/

import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int a;

		System.out.println("Guess what number I'm thinking of. It's between 1 and 10,000. ");
		a = keyboard.nextInt();

		if (a == 5927)
		{
				System.out.println("Well Concered!");
		}
		else if (a < 5927 && a > 0)
		{
				System.out.println("Too Low...");
		}
		else if (a > 5927)
		{
				System.out.println("Too High...");
		}
	}
}
