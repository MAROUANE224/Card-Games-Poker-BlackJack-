
public class Partytime  {
	
	public static void PartyWinner(int player, int computer){
	if(player > computer){
        System.out.println("The Player won! The players score was " + player + ", and the dealers score was " + computer);
    }
    else if(player < computer){
        System.out.println("The Dealer won! The players score was " + player + ", and the dealers score was " + computer);
    }else if(player == computer){
    	System.out.println("No0 one won! The players score was " + player + ", and the dealers score was " + computer +"they were equal why dont you play another game");
    }
	}
}
