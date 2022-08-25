//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class FahrenheitRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the fahrenheit value :: " );
		double fahr = kb.nextDouble();
		
		//print your answer here
		
		double celc = (fahr - 32D) * (5D/9D);
		System.out.printf("%.2f", celc);
		
	}
}

/*
 
Sample Data: 
98.6
52.30
82.45
75.00
100.00

Sample Output : 
37.00 degrees Celsius
11.28 degrees Celsius
28.03 degrees Celsius
23.89 degrees Celsius
37.78 degrees Celsius


*/
