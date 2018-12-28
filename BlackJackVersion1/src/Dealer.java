

public class Dealer {
	
	public static int dealertotal1;
	
	public static int displayDealer() throws InterruptedException {
		int dealertotal = 0;

	System.out.println("The facedown card that the computer had was: ");
	 System.out.println(" ______");
	    System.out.println("|?     |");
	    System.out.println("|   ?  |");
	    System.out.println("| ?  ? |");
	    System.out.println("|      |");
	    System.out.println("|_____?|");
    dealertotal = dealertotal + Deck.getCardfromDeck("Dealer");
    System.out.println("\nComputers total is now: " + dealertotal);
    Thread.sleep(600);


    // The dealer should hit when his score is <17
    while (dealertotal < 17) {

        Thread.sleep(800);
        System.out.println("The Computer gets a new card: ");
        dealertotal = dealertotal + Deck.getCardfromDeck("Dealer");
        System.out.println("\n Their total is now " + dealertotal);
    }
    if (dealertotal > 21) {
        Thread.sleep(800);
        System.out.println("Computer busted, total is over 21, and Computer lost, you won! Computer total was " + dealertotal);
        System.exit(1);
    }
    else if (dealertotal <= 21) {
        Thread.sleep(800);
        System.out.println("Okay, Computer stopped at " + dealertotal);
       
    }
    
    return dealertotal1 = dealertotal;
	}
	}
	