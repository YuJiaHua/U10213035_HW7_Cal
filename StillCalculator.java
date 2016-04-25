//U10213035虞家樺

//Import all Function
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class StillCalculator extends Application{
	//Save result
	double sum;
	//Save Operator and first number and second number
	String digi[] = new String[3];
	//Creates Buttons
	private Button digits[]=new Button[30];
	//Creates a TextField with empty text content
	private TextField tf = new TextField();
	private TextField tf2 = new TextField();
	
	public void start (Stage primaryStage) {
		//Add GridPane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		//Constructs a new Insets instance with four different border distance
		pane.setPadding(new Insets(-5,-4, 10, -4));
		//The width of the horizontal gaps between columns
		pane.setHgap(10);
		//The height of the vertical gaps between rows
		pane.setVgap(10);
		
		//Indicates whether this TextInputControl can be edited by the user
		tf.setEditable(false);
		tf.setAlignment(Pos.CENTER_RIGHT);
		tf.setPrefHeight(40);
		tf2.setEditable(false);
		tf2.setAlignment(Pos.CENTER_RIGHT);
		
		digits[0] = new Button("MC");
		digits[1] = new Button("MR");
		digits[2] = new Button("M+");
		digits[3] = new Button("M-");
		digits[4] = new Button("MS");
		digits[5] = new Button("M^");
		digits[6] = new Button("7");
		digits[7] = new Button("8");
		digits[8] = new Button("9");
		digits[9] = new Button("+");
		digits[10] = new Button("CE");
		digits[11] = new Button("C");
		digits[12] = new Button("4");
		digits[13] = new Button("5");
		digits[14] = new Button("6");
		digits[15] = new Button("-");
		digits[16] = new Button("x^2");
		digits[17] = new Button("1/x");
		digits[18] = new Button("1");
		digits[19] = new Button("2");
		digits[20] = new Button("3");
		digits[21] = new Button("X");
		digits[22] = new Button("√");
		digits[23] = new Button("%");
		digits[24] = new Button("+-");
		digits[25] = new Button("0");
		digits[26] = new Button(".");
		digits[27] = new Button("/");
		digits[28] = new Button("←");
		digits[29] = new Button("=");
		//Add Button and TextField from pane
		pane.add(tf,1,2,6,1);
		pane.add(tf2,1,1,6,1);
		for(int i = 0; i <= 5; i++){
			pane.add(digits[i],i+1,3);
		}
		for(int i = 6; i <= 11; i++){
			pane.add(digits[i],i-5,4);
		}
		for(int i = 12; i <= 17; i++){
			pane.add(digits[i],i-11,5);
		}
		for(int i = 18; i <= 23; i++){
			pane.add(digits[i],i-17,6);
		}
		for(int i = 24; i <= 29; i++){
			pane.add(digits[i],i-23,7);
		}	

		//Set Button's size
		for(int i = 29; i >=0 ; i--){
			digits[i].setPrefSize(50, 50);
		}
		
		//1 Button
		digits[18].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "1");
		});
		//2 Button
		digits[19].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "2");
		});
		//3 Button
		digits[20].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "3");
		});
		//4 Button
		digits[12].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "4");
		});
		//5 Button
		digits[13].setOnAction(event -> {	
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "5");
		});
		//6 Button
		digits[14].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "6");
		});
		//7 Button
		digits[6].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "7");
		});
		//8 Button
		digits[7].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "8");
		});
		//9 Button
		digits[8].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "9");
		});
		//0 Button
		digits[25].setOnAction(event -> {
			if(digi[2] == "="){
				tf.setText("");
				digi[2] = "";
			}
			tf.setText(tf.getText() + "0");
		});
		//+ Button
		digits[9].setOnAction(event -> {
			tf.setText(tf.getText());
			digi[0] = tf.getText();		
			digi[2] = "+";
			tf.setText("");
		});
		//- Button
		digits[15].setOnAction(event -> {
			tf.setText(tf.getText());
			digi[0] = tf.getText();
			digi[2] = "-";
			tf.setText("");
		});
		//X Button
		digits[21].setOnAction(event -> {
			tf.setText(tf.getText());
			digi[0] = tf.getText();
			digi[2] = "X";
			tf.setText("");
		});
		// /Button
		digits[27].setOnAction(event -> {
			tf.setText(tf.getText());
			digi[0] = tf.getText();
			digi[2] = "/";
			tf.setText("");
		});
		// C Button
		digits[11].setOnAction(event -> {
			tf.setText("");
		});
		// = Button
		digits[29].setOnAction(event -> {
			digi[1] = tf.getText();	
			double number1 = Double.parseDouble(digi[0]);
			double number2 = Double.parseDouble(digi[1]);
			if(digi[2] == "+"){
				sum = number1 + number2;
				tf.setText(String.valueOf(sum));
			}else if(digi[2] == "-"){
				sum = number1 - number2;
				tf.setText(String.valueOf(sum));
			}else if(digi[2] == "X"){
				sum = number1 * number2;
				tf.setText(String.valueOf(sum));
			}else if(digi[2] == "/"){
				sum = number1 / number2;
				tf.setText(String.valueOf(sum));
			}
			digi[2] = "=";
		});
		// . Button
		digits[26].setOnAction(event -> {
			tf.setText(tf.getText() + ".");
		});
		// ← Button
		digits[28].setOnAction(event -> {
			tf.setText((tf.getText()).substring(0,(tf.getText()).length()-1));
		});
		// +- Button
		digits[24].setOnAction(event -> {
			digi[0] = tf.getText();		
			double number = Double.parseDouble(digi[0]);
			tf.setText(String.valueOf((number * -1)));
		});
		// CE Button
		digits[10].setOnAction(event -> {
			tf.setText("");
		});
		// % Button
		digits[23].setOnAction(event -> {
			digi[0] = tf.getText();		
			double number = Double.parseDouble(digi[0]);
			tf.setText(String.valueOf((number / 100)));
		});
		// √ Button
		digits[22].setOnAction(event -> {
			digi[0] = tf.getText();		
			double number = Double.parseDouble(digi[0]);
			tf.setText(String.valueOf(Math.sqrt(number)));
		});
		// 1/x Button
		digits[17].setOnAction(event -> {
			digi[0] = tf.getText();		
			double number = Double.parseDouble(digi[0]);
			tf.setText(String.valueOf(1 / number));
		});
		// x^2 Button
		digits[16].setOnAction(event -> {
			digi[0] = tf.getText();		
			double number = Double.parseDouble(digi[0]);
			tf.setText(String.valueOf(Math.pow(number, 2)));
		});
		//Creates a new empty MenuBar
		MenuBar mb = new MenuBar();
		//Constructs a Menu and sets the display text with the specified text.
		Menu m1 = new Menu("檢視");
		Menu m2 = new Menu("編輯");
		Menu m3 = new Menu("說明");
		
		//Add Menu from MenuBar
		mb.getMenus().addAll(m1,m2,m3);
		pane.add(mb,0,0,8,1);
		
		//Creates a Scene for a specific root Node
		Scene scene = new Scene(pane);
		//Defines whether the Stage is do not to resizable by the user
		primaryStage.setResizable(false);
		//Set title from the window 
		primaryStage.setTitle("StillCalculator");
		//Add Scene from the window
		primaryStage.setScene(scene);
		//Show the Scene
		primaryStage.show();
	}	
}
