//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	for(int i = 0; i < 4; i++) {
		System.out.print("*****---------------\n");
	}
   }

   public void printTwentyDashes()
   {
	for(int i = 0; i < 20; i++) {
		System.out.print("-");
	}
	System.out.print("\n");
   }

   public void printTwoBlankLines()
   {
	System.out.print("\n\n");
   }
   
   public void printASmallBox()
   {
	System.out.println("####\n|  |\n####");
   }
 
   public void printABigBox()
   { 	
	System.out.println("#------#\n|      |\n|      |\n|      |\n#------#");
   }   
}