public class FirstClassTicket extends Ticket {
	double firstClassBaseCost = 2175.00;
	double drinkCost;
	public FirstClassTicket(String nameIn, int numOfBags, int numOfDrinks) {
		super(nameIn, numOfBags, numOfDrinks);


	}

	public double getCost() {
		if(numOfDrinks <= 2) {
			numOfDrinks = 0;
		} else if(numOfDrinks > 2) {
			numOfDrinks -= 2;
		}
		return firstClassBaseCost + (numOfBags * 30.00) + (numOfDrinks * 2.50);
	}

}