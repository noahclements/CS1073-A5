public class EconomyTicket extends Ticket {
	double economyBaseCost = 1350.00;
	double bagCost = 50;
	public EconomyTicket(String nameIn, int numOfBags, int numOfDrinks) {
		super(nameIn, numOfBags, numOfDrinks);
	}

	public double getCost() {
		if(numOfBags > 1) {
			bagCost = bagCost + ((numOfBags - 1)  * 35.00);
		}
		return economyBaseCost + (2.50 * numofDrinks) + bagCost;
	}

	public int getBoardingGroupNum() {
		return random.nextInt(4-2 + 1) + 2;
	}


}