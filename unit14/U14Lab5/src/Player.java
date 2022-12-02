//(c) A+ Computer Science
//www.apluscompsci.com

//Player class 

public class Player
{
	private String name;
	private String choice;

	public Player(String nm)
	{
		name = nm;
	} 	
	
	public Player(String nm, String ch)
	{
		name = nm;
		choice = ch;
	} 
		
	public void setName( String nm)
	{
		name = nm;
	}	
		
	public void setChoice( String ch )
	{
		choice = ch;
	}	
		
	public String getChoice()
	{
		return choice;
	}	
		
	public String getName()
	{
		return name;
	}

	@Override
	public String toString() {
		return "Player{" +
				"name='" + name + '\'' +
				", choice='" + choice + '\'' +
				'}';
	}
}