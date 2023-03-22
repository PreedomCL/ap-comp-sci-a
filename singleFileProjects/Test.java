import java.util.Scanner;

import static java.lang.System.out;

class Test {

	private static class Other {
		public int one = 1;
		public int two = 2;
	}

	private static class Check
	{
		private int fun;
		private Other o;

		public void change()
		{
			int fun = 5;
		}

		public String toString()
		{
			return o.toString();
		}
	}

	public static void main(String[] args) {
		int total = 0;
		for( int i = 0; i <= 10; i =  i + 3 )
			for( int x = 1; x <= i; x = x + 2)
		total = total + x;
		System.out.println(total);
	}
}