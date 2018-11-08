import java.util.Random;
public class EconomyTicket extends Ticket {
	private double economyBaseCost = 1350.00;
	private double bagCost;
	private Random rnd = new Random();
	private String name;
	private int numOfBags;
	private int numOfDrinks;
	public EconomyTicket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		//super(nameIn, numOfBagsIn, numOfDrinksIn);
		name = nameIn;
		numOfBags = numOfBagsIn;
		numOfDrinks = numOfDrinksIn;
		bagCost = 0;
	}

	public double getCost() {
		if(numOfBags > 1) {
			bagCost = bagCost + ((numOfBags - 1)  * 35.00) + 50;
		} else if(numOfBags == 1) {
			bagCost = 50;
		}
		return economyBaseCost + (2.50 * numOfDrinks) + bagCost;
	}

	public int getBoardingGroupNum() {
		return rnd.nextInt(4-2 + 1) + 2;
	}


}