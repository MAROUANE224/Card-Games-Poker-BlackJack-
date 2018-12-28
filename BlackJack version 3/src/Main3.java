import java.util.Random;


public class Main3 {
	public static void main(String[] args) throws InterruptedException {
		int dog = 0, cat=0;
		 System.out.println("Welcome to BlackJack!");
		 System.out.println("\nShuffling cards... Will deal in 2 seconds.");
		 Thread.sleep(1000);
		 System.out.println("\n-------------------------\n");
		 Thread.sleep(1000);
		
		 
		 
		 Random rng = new Random();
			int i = rng.nextInt(13);
			 Deck vaishvik = new Deck();
			Cards randomCard  = vaishvik.getCardByIndex(i);
			 System.out.print(randomCard.getRank());
			 
			 dog = randomCard.getSuit();
			 String edge = null;
			 
			 if (dog == 1){
				 edge = "heart";
			 }
			 else if (dog == 2){
				 edge = "spades";
			 }
			 else if (dog == 3){
				 edge = "leaf";
			 }
			 else if (dog == 4){
				 edge = "diamonds";
			 }
			 System.out.print("    ");
			 System.out.println(edge);
		 
		
		
}
}