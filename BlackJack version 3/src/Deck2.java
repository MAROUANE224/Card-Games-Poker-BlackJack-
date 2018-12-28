import java.util.Random;


public class Deck2 {
	
	public static int getCardfromDeck(String name, int i) {

	    return newProcess(name);
	    
	}   
	public static int newProcess(String name) {
		Random rng = new Random();
		int i = rng.nextInt(13);
		 Deck vaishvik = new Deck();
		Cards randomCard  = vaishvik.getCardByIndex(i);
		 System.out.print(randomCard.getRank());
		 System.out.print("    ");
		 System.out.println(randomCard.getSuit());
		
		
		int currentcard=0;
		if (randomCard.getRank() == 0){
			currentcard = randomCard.getRank() +1;
		}
		currentcard = randomCard.getRank();
			if (currentcard == 11 || currentcard == 12 || currentcard == 13 ){
         currentcard = 10;
         }
				if(name.equals("Player")){
    	System.out.println(" ______");
       	System.out.println("|"+currentcard+"    |");
       //	System.out.println("|      |");
    	//System.out.println("|      |");
    	//System.out.println("|      |");
       	System.out.println("|____"+currentcard+"|");
       	return currentcard;
      }
     else
    	 System.out.println(" ______");
  	System.out.println("|"+currentcard+"     |");
//	System.out.println("|       |");
//System.out.println("|       |");
//	System.out.println("|       |");
	System.out.println("|_____"+currentcard+"|");
    	 return currentcard;
}

}

        
	 
	
		
	 
    	
       