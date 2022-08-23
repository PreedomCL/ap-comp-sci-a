//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StarsRunner {
	public static void main(String[] args) {
		StarsAndStripes stars = new StarsAndStripes();
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