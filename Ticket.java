public abstract class Ticket {
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

	public abstract double getCost();

	public abstract int getBoardingGroupNum();

	public String toString() {
		return "Name: " + name + "\n" + "Number of Bags: " + numOfBags + "\n" + "Number of drinks: " + numOfDrinks + "\n" + "Cost: " + getCost() 
		+ "\n" + "Boarding number: " + getBoardingGroupNum();
	}


}