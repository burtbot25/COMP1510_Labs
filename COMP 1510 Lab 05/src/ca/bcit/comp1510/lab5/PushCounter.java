package ca.bcit.comp1510.lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Demonstrates JavaFX buttons and event handlers.
 * 
 * @author Lewis & Loftus 9e
 * @author Wilburt Herrera
 * @version 2017
 */
public class PushCounter extends Application {
    
    /** Holds the number of time the button is pressed. */
    private int count;
    
    /** Holds the number of time the button is pressed. */
    private int vote;
    
    /** Displays the number of times the button is pressed. */
    private Text voteText;
    
    /** Displays the number of times the button is pressed. */
    private Text countText;
    
    /**
     * Holds String Representation of the User's input.
     */
    private TextField userSet;


    /**
     * Presents a GUI containing a button and text that displays
     * how many times the button is pushed and a text field that
     * accepts the user input to update the values of the text.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {        
        count = 0;
        vote = 0;
        voteText = new Text("Votes: 0");
        countText = new Text("Count: 0");
        
        /**
         * Controls to increase and decrease "vote" count.
         */
        Button voteYes = new Button("Yes!");
        voteYes.setOnAction(this::processYesButtonIncrease);

        Button voteNotYes = new Button("Not Yes!");
        voteNotYes.setOnAction(this::processYesButtonDecrease);
        
        /**
         * Controls to increase and decrease "count" count.
         */
        Button countNo = new Button("No!");
        countNo.setOnAction(this::processNoButtonIncrease);

        Button countNotNo = new Button("Not No!");
        countNotNo.setOnAction(this::processNoButtonDecrease);
        
        /**
         * Text-field control accepts and process user input.
         */
        Label inputLabel = new Label("Set Counts to:");
        userSet = new TextField();
        userSet.setOnAction(this::processReturn);
        
        
        FlowPane pane = new FlowPane(voteYes, voteText, voteNotYes,
            countNo, countText, countNotNo, inputLabel, userSet);
        pane.setAlignment(Pos.CENTER);
        
        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: cyan");

        final int appWidth = 800;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Increases the vote counter and updates text when the button is pushed.
     * @param event invokes this method
     */
    public void processYesButtonIncrease(ActionEvent event) {
        vote++;
        voteText.setText("Votes: " + vote);
    }
    
    /**
     * Decreases the vote counter and updates text when the button is pushed.
     * @param event invokes this method
     */
    public void processYesButtonDecrease(ActionEvent event) {
        vote--;
        voteText.setText("Votes: " + vote);
    }
    
    /**
     * Increases counter and updates text when the button is pushed.
     * @param event invokes this method
     */
    public void processNoButtonIncrease(ActionEvent event) {
        count++;
        countText.setText("Count: " + count);
    }
    
    /**
     * Decreases the vote counter and updates text when the button is pushed.
     * @param event invokes this method
     */
    public void processNoButtonDecrease(ActionEvent event) {
        count--;
        countText.setText("Count: " + count);
    }
    
    
    /**
     * Updates count and vote counters to the user's input when user
     * presses the return key while in the text field.
     * 
     * @param event
     *            invokes this method
     */
    public void processReturn(ActionEvent event) {
        count = Integer.parseInt(userSet.getText());
        vote = Integer.parseInt(userSet.getText());
        voteText.setText("Votes: " + vote);
        countText.setText("Count: " + count);
        userSet.setText("");
    }
    
    
    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

