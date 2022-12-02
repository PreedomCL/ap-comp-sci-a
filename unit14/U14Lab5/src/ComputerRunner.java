//© A+ Computer Science  -  www.apluscompsci.com

//Computer Runner 

public class ComputerRunner
{
	public static void main(String[] args)
	{
		//instantiate a new Computer named c

		Computer c = new Computer();
		
		//call and print out getChoice()				//outs random choice
		c.randomSetChoice();
		System.out.println(c);								//outs pooter random choice

		
		//this code will test didIWin( Player p )
		System.out.println(c.didIWin(new Player("dude","ROCK")));
		System.out.println(c.didIWin(new Player("dude","PAPER")));
		System.out.println(c.didIWin(new Player("dude","SCISSORS")));
	}
}





