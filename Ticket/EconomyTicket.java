/**
	Represents the Economy ticket class
	@author Noah Clements 3585596
*/
import java.util.Random;
public class EconomyTicket extends Ticket {
	/** the base cost for an economy ticket */
	private double economyBaseCost = 1350.00;
	/** the cost of the bags */
	private double bagCost;
	/** random number generator */
	private Random rnd = new Random();
	/** the name of the person */
	private String name;
	/** the number of bags the person is bringing */
	private int numOfBags;
	/** the number of drinks the person is ordering */
	private int numOfDrinks;

	/**
		The constructor method for the economy ticket 
		@param nameIn the name of the person
		@param numOfBagsIn the number of bags they're bringing
		@param numOfDrinksIn the number of drinks they're ordering
	*/
	public EconomyTicket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		name = nameIn;
		numOfBags = numOfBagsIn;
		numOfDrinks = numOfDrinksIn;
		bagCost = 50;
	}
	/**
		gets the cost of an economy flight 
		@return the cost of an economy flight
	*/
	public double getCost() {
		if(numOfBags > 1) {
			// calculates the bag cost for $35/bag if number is >1
			bagCost = bagCost + ((numOfBags - 1)  * 35.00);
		}
		return economyBaseCost + (2.50 * numOfDrinks) + bagCost;
	}
	/**
		returns the boarding group number for the person 
		@return the boarding group number for the person 
	*/
	public int getBoardingGroupNum() {
		// calculates a random number thats either 2, 3, or 4
		return rnd.nextInt(4-2 + 1) + 2;
	}


}