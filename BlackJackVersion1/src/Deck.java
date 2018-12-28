import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Deck{
	
	
	  public static int getCardfromDeck(String name) {

	        return newValor(name);
	        
	    }

	   
	    public static int newValor(String name) {
	         Random rng = new Random();
	         int currentcard = rng.nextInt(13);
	         if (currentcard == 0){
	         currentcard = currentcard +1;
	         }
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
      //     	System.out.println("|       |");
    //    	System.out.println("|       |");
        //	System.out.println("|       |");
           	System.out.println("|_____"+currentcard+"|");
	        	 return currentcard;
            }

	
	
}
	

	

