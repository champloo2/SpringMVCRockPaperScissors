package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Game {
	

	private String player1;
	private String computerPlayer;
	private String winner;
	
	//takes in user choice, generates a computer choice determins winner
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
		}
	
	//generates random number and assigns computer choice
	public void setComputerPlayerToRandom()
	{
		if (x==1) this.computerPlayer = "rock";
		if (x==2) this.computerPlayer = "paper";
		if (x==3) this.computerPlayer = "scissors";
		if (x==4) this.computerPlayer = "lizard";
		if (x==5) this.computerPlayer = "spock";
	}
	
	
	public void determineWinner()
	{
		String computerPlayer = this.computerPlayer;
		String player1 = this.player1;
		String gameWinner = "tie";
		
		if (player1 == "rock")
		{
			switch (computerPlayer)
			{
			case "rock": gameWinner = "tie";
			case "paper": gameWinner = "computer";
			case "scissors": gameWinner = "player";
			case "lizard": gameWinner = "player";
			case "spock": gameWinner = "computer";
			
			}
		}
		
		else if (player1 == "paper")
		{
			switch (computerPlayer)
			{
			case "rock": gameWinner = "player";
			case "paper": gameWinner = "tie";
			case "scissors": gameWinner = "computer";
			case "lizard": gameWinner = "computer";
			case "spock": gameWinner = "player";
			
			}
		}
		
		else if (player1 == "scissors")
		{
			switch (computerPlayer)
			{
			case "rock": gameWinner = "computer";
			case "paper": gameWinner = "player";
			case "scissors": gameWinner = "tie";
			case "lizard": gameWinner = "player";
			case "spock": gameWinner = "computer";
			
			}
		}
		else if (player1 == "lizard")
		{
			switch (computerPlayer)
			{
			case "rock": gameWinner = "computer";
			case "paper": gameWinner = "player";
			case "scissors": gameWinner = "computer";
			case "lizard": gameWinner = "tie";
			case "spock": gameWinner = "player";
			
			}
		}
		
		//player1 == spock
		else 
		{
			switch (computerPlayer)
			{
			case "rock": gameWinner = "player";
			case "paper": gameWinner = "computer";
			case "scissors": gameWinner = "player";
			case "lizard": gameWinner = "computer";
			case "spock": gameWinner = "tie";
			
			}
		}
		
		this.winner = gameWinner;
		
		
	    
	}
	
	

}
