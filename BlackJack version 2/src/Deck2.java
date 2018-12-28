import java.util.Random;

public class Deck2 {


	public static int getCardfromDeck(String name, int turn) {
		  // Aces = 11, Picture cards = 10, Ace's cannot be reduced to 1.
        int[] newCard = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11};

        
        shuffleArray(newCard);
    	
         if(name.equals("Player")){
        	System.out.println(" ______");
           	System.out.println("|"+newCard[0 + turn]+"    |");
           //	System.out.println("|      |");
        	//System.out.println("|      |");
        	//System.out.println("|      |");
           	System.out.println("|____"+newCard[0 + turn]+"|");
           	return newCard[0 + turn];
         }
         else
        	 System.out.println(" ______");
      	System.out.println("|"+newCard[4 + turn]+"     |");

      	System.out.println("|_____"+newCard[4 + turn]+"|");
        	 return newCard[4 + turn];
  }

    static void shuffleArray(int[] vashCards){

        Random rnd = new Random();
        for (int i = vashCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
           
            int a = vashCards[index];
            vashCards[index] = vashCards[i];
            vashCards[i] = a;
        }
	}

}
   