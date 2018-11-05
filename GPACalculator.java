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
public class GPACalculator extends Application {
	private TextField letterGradeField;
	private TextField creditHoursField;
	private Text pointsResult;
	private Text resultGPA;
	double gradePoints = 0;
	double totalGradePoints = 0;
	int totalCreditHours = 0;
	int creditsInput;
	String gradeInput;

	public void start(Stage primaryStage) {
		primaryStage.setTitle("GPA Calculator");

		Label letterGradeText = new Label("Course letter grade:");
		letterGradeField = new TextField();
		letterGradeField.setPrefWidth(50);
		letterGradeField.setOnAction(this::processGPA);

		Button addToGPA = new Button("Add to GPA");
		addToGPA.setOnAction(this::processGPA);

		Button clearGPA = new Button("Clear GPA");
		clearGPA.setOnAction(this::clearGPA);


		Label creditHoursText = new Label("Course credit hours:");
		creditHoursField = new TextField();
		creditHoursField.setPrefWidth(50);
		creditHoursField.setOnAction(this::processGPA);

		pointsResult = new Text("Welcome to my GPA calculator!");
		resultGPA = new Text("Enter your 1st grade & credit hrs.");

		FlowPane pane = new FlowPane
		(letterGradeText, letterGradeField, addToGPA, clearGPA, creditHoursText, creditHoursField, pointsResult, resultGPA);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(20);

		Scene scene = new Scene(pane, 300, 150);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void processGPA(ActionEvent event) {
		gradeInput = letterGradeField.getText();
		creditsInput = Integer.parseInt(creditHoursField.getText());

		if(gradeInput.equals("A+")) {
			gradePoints = 4.3;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("A")) {
			gradePoints = 4.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("A-")) {
			gradePoints = 3.7;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("B+")) {
			gradePoints = 3.3;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("B")) {
			gradePoints = 3.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("B-")) {
			gradePoints = 2.7;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("C+")) {
			gradePoints = 2.3;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("C")) {
			gradePoints = 2.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("D")) {
			gradePoints = 1.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("F")) {
			gradePoints = 0.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else if(gradeInput.equals("WF")) {
			gradePoints = 0.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditHours));
		} else {
			pointsResult.setText("Invalid grade - GPA not changed");
		}

	}

	public void clearGPA(ActionEvent event) {
		totalGradePoints = 0;
		totalCreditHours = 0;
		pointsResult.setText("Totals have been reset.");
		resultGPA.setText("Enter your 1st grade & credit hrs.");
	}



}