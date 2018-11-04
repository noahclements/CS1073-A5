import javafx.application.Application;
import javafx.stage.Scene;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
public class GPACalculator extends Application {
	private TextField letterGrade;
	private TextField creditHours;
	private Text pointsResult;
	private Text GPAresult;
	double gradePoints = 0;
	double totalGradePoints = 0;
	int totalCreditHours = 0;

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
		GPAresult = new Text("Enter your 1st grade & credit hrs.");

		FlowPane pane = new FlowPane
		(letterGradeText, letterGradeField, addToGPA, clearGPA, creditHoursText, creditHoursField, pointsResult, GPAresult);
		pane.setAlignment(Pos.CENTER);
		pane.setHGap(10);
		pane.setVgap(20);

		Scene scene = new Scene(pane, 300, 150);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void processGPA(ActionEvent event) {
		String gradeInput = letterGradeField.getText();
		int creditsInput = Int.parseInt(creditHoursField.getText());

		if(gradeInput.equals("A+")) {
			gradePoints = 4.3;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("A")) {
			gradePoints = 4.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("A-")) {
			gradePoints = 3.7;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("B+")) {
			gradePoints = 3.3;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("B")) {
			gradePoints = 3.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("B-")) {
			gradePoints = 2.7;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("C+")) {
			gradePoints = 2.3;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("C")) {
			gradePoints = 2.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("D")) {
			gradePoints = 1.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("F")) {
			gradePoints = 0.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else if(gradeInput.equals("WF")) {
			gradePoints = 0.0;
			pointsResult.setText("Points for this course: " + (double)(gradePoints * creditsInput));
			totalGradePoints += gradePoints;
			totalCreditHours += creditHours;
			GPAresult.setText("Your culmulative GPA is: " + (double)(totalGradePoints / totalCreditsHours));
		} else {
			pointsResult.setText("Invalid grade - GPA not changed");
		}

	}

	public void clearGPA(ActionEvent event) {
		totalGradePoints = 0;
		totalCreditsHours = 0;
		pointsResult.setText("Totals have been reset.");
		GPAResult.setText("Enter your 1st grade & credit hrs.");
	}



}