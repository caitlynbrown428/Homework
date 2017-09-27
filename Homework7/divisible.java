/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   9/29/2017
 ******************************************************************************/

import java.util.Scanner;

public class divisible
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int year;

		System.out.println("Give me a year, I'll tell you if it's a leap year or not. ");
		year = keyboard.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			{
				System.out.println("It's a leap year!");
			}
		}
		else
		{
			System.out.println("That is not a leap year.");
		}
	}
}
