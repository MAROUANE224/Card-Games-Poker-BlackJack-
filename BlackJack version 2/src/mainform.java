public class mainform {
	
	public static void main(String[] args) throws InterruptedException {
		int dog = 0, cat=0;
		 System.out.println("Welcome to BlackJack!");
		 System.out.println("\nShuffling cards... Will deal in 2 seconds.");
		 Thread.sleep(1000);
		 System.out.println("\n-------------------------\n");
		 Thread.sleep(1000);
		 Player vaishvik = new Player(); 
		 dog = dog +  vaishvik.displayPerson();
		 Computer jerry = new Computer();
		 cat = cat + jerry.displayComputer();
		 partytime.PartyWinner(dog,cat);
	}
}
