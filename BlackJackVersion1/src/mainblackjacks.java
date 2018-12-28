import java.util.Scanner;



public class mainblackjacks {
	 public static void main(String[] args) throws InterruptedException {
		 int playertotal = 0;
		 int counter = 0;
		 int dog =0;
		  String hitorstay2 = null;
		 System.out.println("Welcome to BlackJack!");
		
	 
		 System.out.println("\nShuffling cards... Will deal in 2 seconds.");
		 Thread.sleep(1000);
		 System.out.println("\n-------------------------\n");
		 Thread.sleep(1000);
		 System.out.println("You drew the cards: ");
		 Thread.sleep(800);
		 playertotal = playertotal + Deck.getCardfromDeck("Player");
		 Thread.sleep(800);
		 System.out.println("\n    & ");
		 Thread.sleep(800);
		 playertotal = playertotal + Deck.getCardfromDeck("Player");
		 Thread.sleep(1000);
		 System.out.println("\nYour total is: " + playertotal + "!");
		 Thread.sleep(1000);
		 System.out.println("\nThe dealer drew the card");
		 Thread.sleep(500);
		 Deck.getCardfromDeck("Dealer");
		 Thread.sleep(800);
		 System.out.println("And another card he wont show yet");
		 Thread.sleep(1200);
		 System.out.println(" : ______ :");
		 System.out.println(" Random Card");
		 Thread.sleep(1000);
		 System.out.println("Would you like to 'draw' or 'stay'?");
		 Scanner scan = new Scanner(System.in);
		 String hitorstay = scan.nextLine();
		 Thread.sleep(800);
		  if (hitorstay.equalsIgnoreCase("stay")){
			  if (playertotal > 1 ){
				  counter = counter + 4;
				  System.out.println("I see you are a skilled player.");
		    		System.out.println("Great Choice ");
		    	}
		        System.out.println("Your Smart but can you beat the computer!" + ", Computers turn");
		        Thread.sleep(800);
		        System.out.println("just chill and have drink the computer is thinking");
		        Thread.sleep(800);
		       
		       dog = dog + Dealer.displayDealer();
		       Thread.sleep(1000);
		        Partytime.PartyWinner(playertotal,dog);
			  
		  }else if(counter < 2){
		 while (counter < 2){	
		 if (hitorstay.equalsIgnoreCase("draw")) {
		        System.out.println("You drew an ");
		        playertotal = playertotal + Deck.getCardfromDeck("Player");
		        System.out.println("\n Your total is now " + playertotal);
		        Thread.sleep(800);
		       
		        if (playertotal > 21) {
		            Thread.sleep(800);
		            System.out.println("You busted, total is over 21, you lost, and you got " + playertotal);
		            System.exit(1);
		        }
		        
		       
		        System.out.println("Would you like to 'draw' or 'stay?'");
		        hitorstay = scan.nextLine();
		        if (hitorstay.equalsIgnoreCase("stay")){
		        	counter = counter + 4;
		        } else {
		        errorcheck.dogger(hitorstay);
		        	
		        }
		    }else{
		    	errorcheck.dogger(hitorstay);
		    	
		    }
		 }
		     if (hitorstay.equalsIgnoreCase("stay")  ) {
		    	if (playertotal > 1 ){
		    		System.out.println("I see you are a skilled player.");
		    		System.out.println("Great Choice ");
		    	}
		        System.out.println("Your Smart but can you beat the computer!" + ", Computers turn");
		        Thread.sleep(800);
		        System.out.println("just chill and have drink the computer is thinking");
		        Thread.sleep(800);
		       
		       dog = dog + Dealer.displayDealer();
		       Thread.sleep(1000);
		        Partytime.PartyWinner(playertotal,dog);
		    }
		     else{
		    	 
		    	errorcheck.dogger(hitorstay);
		    	
		     }
		     
	 }else {
	errorcheck.dogger(hitorstay);
		 
	 }
}
}