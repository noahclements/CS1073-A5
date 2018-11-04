import java.util.Random;
public class EconomyTicket extends Ticket {
	double economyBaseCost = 1350.00;
	double bagCost = 50;
	Random rnd = new Random();
	public EconomyTicket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		super(nameIn, numOfBagsIn, numOfDrinksIn);
	}

	public double getCost() {
		if(super.getNumOfBags() > 1) {
			bagCost = bagCost + ((super.getNumOfBags() - 1)  * 35.00);
		}
		return economyBaseCost + (2.50 * super.getNumOfDrinks()) + bagCost;
	}

	public int getBoardingGroupNum() {
		return rnd.nextInt(4-2 + 1) + 2;
	}


}