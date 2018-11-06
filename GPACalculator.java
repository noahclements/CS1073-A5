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
import java.text.DecimalFormat;
public class GPACalculator extends Application {
	private TextField letterGradeField;
	private TextField creditHoursField;
	private Text pointsResult;
	private Text resultGPA;
	DecimalFormat format = new DecimalFormat(".0"); // max decimals = 1
	double gradePoints = 0;
	double totalGradePoints = 0;
	int totalCreditHours = 0;
	int creditsInput;
	String gradeInput;
	double coursePoints = 0;

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
		boolean gradeIsValid = false;

		if(gradeInput.equals("A+")) {
			gradePoints = 4.3;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("A")) {
			gradePoints = 4.0;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("A-")) {
			gradePoints = 3.7;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("B+")) {
			gradePoints = 3.3;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("B")) {
			gradePoints = 3.0;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("B-")) {
			gradePoints = 2.7;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("C+")) {
			gradePoints = 2.3;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("C")) {
			gradePoints = 2.0;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("D")) {
			gradePoints = 1.0;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("F")) {
			gradePoints = 0.0;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else if(gradeInput.equals("WF")) {
			gradePoints = 0.0;
			coursePoints = (double)(gradePoints * creditsInput);
			pointsResult.setText("Points for this course: " + format.format(coursePoints));
			gradeIsValid = true;
		} else {
			pointsResult.setText("Invalid grade - GPA not changed");
		}

		if(gradeIsValid) {
			totalGradePoints += coursePoints;
			totalCreditHours += creditsInput;
			resultGPA.setText("Your culmulative GPA is: " + format.format((double)(totalGradePoints / totalCreditHours)));
		}

	}

	public void clearGPA(ActionEvent event) {
		totalGradePoints = 0;
		totalCreditHours = 0;
		pointsResult.setText("Totals have been reset.");
		resultGPA.setText("Enter your 1st grade & credit hrs.");
	}



}