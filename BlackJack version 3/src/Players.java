import java.util.Scanner;

public class Players {
	 public static int computer2 = 0;
	public int displayPerson() throws InterruptedException{
		 int counter = 0;
		 int playerTotal = 0;
		 int computerTotal =0;
		 
	System.out.println("You drew the cards: ");
	    Thread.sleep(800);
	 
	    playerTotal = playerTotal + Deck2.getCardfromDeck("Player",1);
	    Thread.sleep(800);
	    System.out.println("\n    & ");
	    Thread.sleep(800);
	
	    playerTotal = playerTotal + Deck2.getCardfromDeck("Player",2);

	    Thread.sleep(1000);
	    System.out.println("\nYour total is: " + playerTotal + "!");
	    Thread.sleep(1000);
	    System.out.println("\nThe dealer drew the card");
	    Thread.sleep(500);
	 
	    computerTotal = computerTotal + Deck2.getCardfromDeck("computer",1);
	    computer2 = computerTotal ;
	    Thread.sleep(800);
	    System.out.println("And a facedown card he wont show yet");
	    Thread.sleep(1200);
	    System.out.println(" : ______ :");
		 System.out.println(" Random Card");
	    System.out.println(" ______");
	    System.out.println("|?     |");
	    System.out.println("|   ?  |");
	    System.out.println("| ?  ? |");
	    System.out.println("|      |");
	    System.out.println("|_____?|");
	    Thread.sleep(1000);
	    while (counter < 2){
	    System.out.println("Would you like to 'hit' or 'stay'?");
	    Scanner scan = new Scanner(System.in);
	    String hitorstay = scan.nextLine();
	    Thread.sleep(800);

	   	
	    if (hitorstay.equalsIgnoreCase("hit")) {

	        System.out.println("You drew an ");
	        playerTotal = playerTotal + Deck2.getCardfromDeck("Player",4);
	        System.out.println("\n Your total is now " + playerTotal);
	        Thread.sleep(800);
	        if (playerTotal > 21) {
	            Thread.sleep(800);
	            System.out.println("You busted, total is over 21, you lost, and you got " + playerTotal);
	            System.exit(1);
	        }
	        Thread.sleep(800);
	       
	       
    }
	    else if (hitorstay.equals("stay")) {
	    	counter = counter + 4;
	    	 System.out.println("I see you are a skilled player.");
		  	  System.out.println("Great Choice ");
	    	System.out.println("Your Smart but can you beat the computer!" + ", Computers turn");
	        System.out.println("just chill and have drink the computer is thinking");
	        
	        break;
	    }
	else{
	     Scanner errorScan = new Scanner(System.in);
	        System.out.println("You typed wrong. Would you like to play again? Y/N");
	    String playagain = errorScan.nextLine();
	        if(playagain.equalsIgnoreCase("Y")){
	            System.out.println("Would you like to 'hit' or 'stay'?");
	            hitorstay = scan.nextLine();}
	        else
	            System.out.println("Good bye. Have a nice day!");
	            System.exit(0);
	    }
		
	}
	    return playerTotal;
	
	   
	   
        
	}
	 public static int computertoralar(){
		  
         return computer2;
	    }
	
}


