/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   9/16/2017
 ******************************************************************************/

import java.util.Scanner;

public class interactive
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		String age;

		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		System.out.printf("Hello, %s! You are %s years old.\n", name, age);

		
	}
}
