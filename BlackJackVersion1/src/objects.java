
public class objects {
	public static void main (String[] args) {
		
		int someinteger = 0;
		String someword = "Vaishvik";
		
		
		Coin quarter = new Coin(25, "big", "silver");
		Coin dime = new Coin(25, "smallest", "silver");
		
		System.out.println("the value of the quarters is" + quarter.getvalue());
		System.out.println("the value of the quarters is" + dime.getvalue());
	
	}	
}
  