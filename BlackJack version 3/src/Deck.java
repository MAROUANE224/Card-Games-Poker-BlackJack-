


public class Deck{
	
	
		private Cards[] theCard = new Cards[52];
		
		
		public Deck(){
			int cardNumber=0;
			for (int i=1; i<14; i++){
				for (int j=1; j<5; j++){
					theCard[cardNumber] = new Cards(j, i);
					cardNumber ++;
				}
			}
			


		}
		
		public Cards getCardByIndex(int i){
			
			return theCard[i];
			
		}
		
		public Cards findCard(int suit, int rank){
			Cards cardToReturn = new Cards(-1,-1);
			for (int z=0; z< 52; z++){
				if (theCard[z].getSuit() == suit && theCard[z].getRank() == rank){
					cardToReturn =  theCard[z];
				}
			}
			return cardToReturn;
		}
	

	
	
}
	
	
	

