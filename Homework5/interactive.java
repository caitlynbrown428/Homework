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

		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("Hello " + name + "!");

		
	}
}
