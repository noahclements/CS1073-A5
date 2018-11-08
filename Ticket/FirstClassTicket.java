/**
	Represents the First Class ticket class
	@author Noah Clements 3585596
*/
public class FirstClassTicket extends Ticket {
	/** the base cost for a first class ticket */
	private double firstClassBaseCost = 2175.00;
	/** the cost of drinks after the discount */
	private int drinksAfterDiscount;
	/** the name of the person*/
	private String name;
	/** the number of bags they're bringing */
	private int numOfBags;
	/** the number of drinks they're ordering */
	private int numOfDrinks;

	/**
		The constructor method for the first class ticket 
		@param nameIn the name of the person
		@param numOfBagsIn the number of bags they're bringing
		@param numOfDrinksIn the number of drinks they're ordering
	*/
	public FirstClassTicket(String nameIn, int numOfBagsIn, int numOfDrinksIn) {
		name = nameIn;
		numOfBags = numOfBagsIn;
		numOfDrinks = numOfDrinksIn;
		drinksAfterDiscount = numOfDrinks;
	}

	/**
		gets the cost of an first class flight 
		@return the cost of an first class flight
	*/
	public double getCost() {
		if(numOfDrinks <= 2) {
			// first class people have 2 free drinks
			drinksAfterDiscount = 0;
		} else if(numOfDrinks > 2) {
			// if its greater than 2, just remove 2 and calculate the cost w/ that
			drinksAfterDiscount -= 2;
		}
		return firstClassBaseCost + (numOfBags* 30.00) + (drinksAfterDiscount * 2.50);
	}
	/**
		returns the boarding group number for the person 
		@return the boarding group number for the person 
	*/
	public int getBoardingGroupNum() {
		// first class tickets are always 1
		return 1;
	}

}