//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StarsRunner {
	public static void main(String[] args) throws FileNotFoundException {
		StarsAndStripes stars = new StarsAndStripes();

		Scanner scanner = new Scanner(new File("src/readme.dat"));
		System.out.println(scanner.nextLine());
		stars.printTwentyStars();
		for(int i = 0; i < 9; i++) {
			stars.printTwentyDashes();
		}
		stars.printTwoBlankLines();
		stars.printASmallBox();
		stars.printTwoBlankLines();
		stars.printABigBox();

		  //call the methods needed to make the patterns on the word document
	}
}