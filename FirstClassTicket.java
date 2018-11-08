public class FirstClassTicket extends Ticket {
	private double firstClassBaseCost = 2175.00;
	private double drinkCost;
	private int drinksAfterDiscount;
	private String name;
	private int numOfBags;
	private int numOfDrinks;

	public FirstClassTicket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		name = nameIn;
		numOfBags = numOfBagsIn;
		numOfDrinks = numOfDrinksIn;
		drinksAfterDiscount = numOfDrinks;
	}

	public double getCost() {
		if(numOfDrinks <= 2) {
			drinksAfterDiscount = 0;
		} else if(numOfDrinks > 2) {
			drinksAfterDiscount -= 2;
		}
		return firstClassBaseCost + (numOfBags* 30.00) + (drinksAfterDiscount * 2.50);
	}

	public int getBoardingGroupNum() {
		return 1;
	}

}