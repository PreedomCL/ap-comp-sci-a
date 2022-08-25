//(c) A+ Computer Science
//www.apluscompsci.com
//NAME - 

import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		String strOne;
		byte byteOne;
		//add more variables


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.println("Enter a word :: ");
		strOne = keyboard.next();

		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();



		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("string one = " + strOne );
		System.out.println("byte one = " + byteOne );

		//add output for all variables


	}
}