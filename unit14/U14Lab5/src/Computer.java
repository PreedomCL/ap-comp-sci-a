//(c) A+ Computer Science 
//www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
		randomSetChoice();
	}
	
	public String getChoice()
	{
		return "";
	}
	
	public void randomSetChoice()
	{
		switch((int)(Math.random() * 3)) {
			case 0:
				choice = "ROCK";
				break;
			case 1:
				choice = "PAPER";
				break;
			case 2:
				choice = "SCISSORS";
				break;
		}
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{
		if(p.getChoice().equals(choice))
			return 0;
		if(choice.equals("ROCK") && p.getChoice().equals("SCISSORS"))
			return 1;
		if(choice.equals("PAPER") && p.getChoice().equals("ROCK"))
			return 1;
		if(choice.equals("SCISSORS") && p.getChoice().equals("PAPER"))
			return 1;
		return -1;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"choice='" + choice + '\'' +
				'}';
	}
}