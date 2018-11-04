public class Ticket {
	private String name;
	private int numOfBags;
	private int numOfDrinks;

	public Ticket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		name = nameIn;
		numOfBags = numOfBagsIn;
		numOfDrinks = numOfDrinksIn;
	}

	public String getName() {
		return name;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public int getNumOfDrinks() {
		return numOfDrinks;
	}

	


}