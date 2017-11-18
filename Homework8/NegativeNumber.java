/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   10/13/2017
 ******************************************************************************/

import java.util.Scanner;

public class NegativeNumber
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num;
		int sum = 0;
		int largest;
	
		System.out.println("Enter a positive number or a negative number to stop: ");
		num = keyboard.nextInt();
		largest = num;
		while (num >= 0)
		{
			sum += num;
			System.out.println("That's positive. Give me a negative number to stop: ");
			num = keyboard.nextInt();
			if (num > largest)
			{
				largest = num;
			}
		}
		System.out.println("That's negative!");
		System.out.println("The sum of the positive numbers is " + sum);
		System.out.println(largest + " is the largest number you typed."); 
	}
}
