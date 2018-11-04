public class FirstClassTicket extends Ticket {
	double firstClassBaseCost = 2175.00;
	double drinkCost;
	int numOfDrinks;
	public FirstClassTicket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		super(nameIn, numOfBagsIn, numOfDrinksIn);
		numOfDrinks = numOfDrinksIn;
	}

	public double getCost() {
		if(super.getNumOfDrinks() <= 2) {
			numOfDrinks = 0;
		} else if(super.getNumOfDrinks() > 2) {
			numOfDrinks -= 2;
		}
		return firstClassBaseCost + (super.getNumOfBags() * 30.00) + (numOfDrinks * 2.50);
	}

	public int getBoardingGroupNum() {
		return 1;
	}

}