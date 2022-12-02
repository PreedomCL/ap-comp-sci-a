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
		String doubles = "1.5 7.4  9.3   3.2   2.0";
		Scanner chopAh = new Scanner(doubles);
		while(chopAh.hasNextDouble())
		{
			double val = chopAh.nextDouble();
			out.println(val);
		}

	}
}