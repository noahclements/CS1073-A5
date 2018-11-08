/**
	Represents the parent class for the economy and first class tickets, where it calculates the cost + boarding num
	@author Noah Clements 3585596
*/
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
	NumberFormat format = NumberFormat.getCurrencyInstance();
	/** the variable representing the user input of the name */
	private String nameInput;
	/** the variable representing the user input of the number of bags */
	private int bagsInput;
	/** the variable representing the user input of the number of bags */
	private int drinksInput;

	/** the text field where the user inputs their name */
	private TextField passengerName;
	/** the text field where the user inputs the # of bags */
	private TextField checkedBags;
	/** the text field where the user inputs the # of drinks */
	private TextField drinks;

	/** the text that displays the boarding group number */
	private Text boardGroupNumber;
	/** the text that displays the cost of the flight */
	private Text costOfFlight;

	/** the button that you press to calculate the cost of an Economy flight */
	private Button economy;
	/** the button that you press to calculate the cost of an First class flight */
	private Button firstClass;

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ticket Calculator");
		

		Label passengerNameText = new Label("Passenger Name:");
		passengerName = new TextField();
		passengerName.setPrefWidth(130);
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
		// the arrangement of the scene
		FlowPane pane = new FlowPane(passengerNameText, passengerName, checkedBagsText, checkedBags, 
			drinksText, drinks, economy, firstClass, reset, boardGroupNumber, costOfFlight);

		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setVgap(20);
		// length/width of the scene
		Scene scene = new Scene(pane, 270, 300);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/**
		calculates the cost of the flight
		@param event button press event
	*/
	public void processCost(ActionEvent event) {
		// variables equalling the various text fields
		nameInput = passengerName.getText();
		bagsInput = Integer.parseInt(checkedBags.getText());
		drinksInput = Integer.parseInt(drinks.getText());
		// if the user presses the economy button
		if(event.getSource() == economy) {
			// constructs a new economy ticket with the variables above
			EconomyTicket t1 = new EconomyTicket(nameInput, bagsInput, drinksInput);
			// and displays the boarding group # and cost of flight
			boardGroupNumber.setText("Boarding Group Number: " + t1.getBoardingGroupNum());
			costOfFlight.setText("Total cost of flight: " + format.format(t1.getCost()));
			// if user presses the first class button
		} else if(event.getSource() == firstClass) {
			FirstClassTicket t2 = new FirstClassTicket(nameInput, bagsInput, drinksInput);
			boardGroupNumber.setText("Boarding Group Number: " + t2.getBoardingGroupNum());
			costOfFlight.setText("Total cost of flight: " + format.format(t2.getCost()));
		}

	}

	/**
		clears all the Text Fields, and resets the texts to original 
		@param event reset button press event
	*/
	public void reset(ActionEvent event) {
		boardGroupNumber.setText("Welcome to Flights R Us!");
		costOfFlight.setText("Enter your ticket information");
		passengerName.clear();	// clears any text inside the field
		checkedBags.clear();
		drinks.clear();

	}


}