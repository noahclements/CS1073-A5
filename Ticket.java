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
public abstract class Ticket extends Application {
	private String name;
	private int numOfBags;
	private int numOfDrinks;

	private TextField passengerName;
	private TextField checkedBags;
	private TextField drinks;

	private Text boardGroupNumber;
	private Text costOfFlight;

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



	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ticket Calculator");
		

		Label passengerNameText = new Label("Passenger Name:");
		passengerName = new TextField();
		passengerName.setPrefWidth(50);
		passengerName.setOnAction(this::processCost);

		Button economy = new Button("Economy");
		economy.setOnAction(this::processCost);

		Button firstClass = new Button("First Class");
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




}