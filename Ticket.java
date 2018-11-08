import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.text.NumberFormat;
public class Ticket extends Application {

	private String name;
	private int numOfBags;
	private int numOfDrinks;

	private String nameInput;
	private int bagsInput;
	private int drinksInput;

	private TextField passengerName;
	private TextField checkedBags;
	private TextField drinks;

	private Text boardGroupNumber;
	private Text costOfFlight;

	private Button economy;
	private Button firstClass;
	/*
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
	*/
/*
	public abstract double getCost();

	public abstract int getBoardingGroupNum();

	public String toString() {
		return "Name: " + name + "\n" + "Number of Bags: " + numOfBags + "\n" + "Number of drinks: " + numOfDrinks + "\n" + "Cost: " + getCost() 
		+ "\n" + "Boarding number: " + getBoardingGroupNum();
	}

*/

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ticket Calculator");
		

		Label passengerNameText = new Label("Passenger Name:");
		passengerName = new TextField();
		passengerName.setPrefWidth(50);
		passengerName.setOnAction(this::processCost);

		economy = new Button("Economy");
		economy.setOnAction(this::processCost);

		firstClass = new Button("First Class");
		firstClass.setOnAction(this::processCost);

		Label checkedBagsText = new Label("Number of checked bags:");
		checkedBags = new TextField();
		checkedBags.setPrefWidth(50);
		checkedBags.setOnAction(this::processCost);

		Label drinksText = new Label("Number of In-flight drinks:");
		drinks = new TextField();
		drinks.setPrefWidth(50);
		drinks.setOnAction(this::processCost);

		Button reset = new Button("Reset");
		reset.setOnAction(this::reset);

		boardGroupNumber = new Text("Welcome to Flights R Us!");
		costOfFlight = new Text("Enter your ticket information");

		FlowPane pane = new FlowPane(passengerNameText, passengerName, economy, 
			firstClass, checkedBagsText, checkedBags, drinksText, drinks, reset, boardGroupNumber, costOfFlight);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(20);

		Scene scene = new Scene(pane, 300, 150);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void processCost(ActionEvent event) {
		nameInput = passengerName.getText();
		bagsInput = Integer.parseInt(checkedBags.getText());
		drinksInput = Integer.parseInt(drinks.getText());

		if(event.getSource() == economy) {
			EconomyTicket t1 = new EconomyTicket(nameInput, bagsInput, drinksInput);
			boardGroupNumber.setText("Boarding Group Number: " + t1.getBoardingGroupNum());
			costOfFlight.setText("Total cost of flight: " + t1.getCost());
		} else if(event.getSource() == firstClass) {
			FirstClassTicket t2 = new FirstClassTicket(nameInput, bagsInput, drinksInput);
			boardGroupNumber.setText("Boarding Group Number: " + t2.getBoardingGroupNum());
			costOfFlight.setText("Total cost of flight: " + t2.getCost());
		}

	}

	public void reset(ActionEvent event) {
		boardGroupNumber.setText("Welcome to Flights R Us!");
		costOfFlight.setText("Enter your ticket information");
		passengerName.clear();
		checkedBags.clear();
		drinks.clear();

	}


}