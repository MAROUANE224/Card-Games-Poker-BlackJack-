import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Deck extends Player {

//Get the card from the Deck
    public static void getCardfromDeck(String name) {

        newValor(name);
    }

    //Parameter 'name' for whom the card should go to.
    public static void newValor(String name) {
         Random rng = new Random();
         int currentcard = rng.nextInt(13);
         currentcard++;

          


            String getValor;
            if (currentcard >= 10 || currentcard == 1) {
             
              
                System.out.println(" ______");
                System.out.println("|"+currentcard+"     |");
               
                System.out.println("|_____"+currentcard+"|");
            }
            else{


                System.out.println(" ______");
                System.out.println("|"+currentcard+"     |");
             
                System.out.println("|_____"+currentcard+"|");
            }
    }


   
}