

public class Computer {
	
	public static int computerTotal1;
	
	public static int displayComputer() throws InterruptedException {
		int computerTotal = 0;
		int	count2 =8; 
		computerTotal = computerTotal + Player.computertoralar();
	System.out.println("The facedown card that the computer had was: ");
	 System.out.println(" ______");
	    System.out.println("|?     |");
	    System.out.println("|   ?  |");
	    System.out.println("| ?  ? |");
	    System.out.println("|      |");
	    System.out.println("|_____?|");
	    computerTotal = computerTotal + Deck2.getCardfromDeck("Dealer", 7);
    System.out.println("\nComputers total is now: " + computerTotal);
    Thread.sleep(600);


    // The dealer should hit when his score is <17
    while (computerTotal < 17) {
    	count2++;
        Thread.sleep(800);
        System.out.println("The Computer gets a new card: ");
        computerTotal = computerTotal + Deck2.getCardfromDeck("Dealer", count2);
        System.out.println("\n Their total is now " + computerTotal);
    }
    if (computerTotal > 21) {
        Thread.sleep(800);
        System.out.println("Computer busted, total is over 21, and Computer lost, you won! Computer total was " + computerTotal);
        System.exit(1);
    }
    else if (computerTotal <= 21) {
        Thread.sleep(800);
        System.out.println("Okay, Computer stopped at " + computerTotal);
       
    }
    
    computerTotal1 = computerTotal;
  		 
     return computerTotal1;
    
	}
	
	
	}
	