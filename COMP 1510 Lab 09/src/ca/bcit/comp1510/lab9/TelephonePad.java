package ca.bcit.comp1510.lab9;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 * PasswordValidator class.
 * @author Wilburt Herrera
 * @version 2017
 */
public class TelephonePad extends Application implements EventHandler<Event> {
    
    /**
     * Number of buttons on a phone.
     */
    public static final int BUTTONS = 9;
    
    /**
     * Limit of numbers on first row.
     */
    public static final int ROW_LIMIT1 = 3;
    
    /**
     * Limit of numbers on second row.
     */
    public static final int ROW_LIMIT2 = 6;
    
    /**
     * Last Row.
     */
    public static final int FIRST_ROW = 0;
    /**
     * Last Row.
     */
    public static final int SECOND_ROW = 1;
    /**
     * Last Row.
     */
    public static final int THIRD_ROW = 2;
    /**
     * Last Row.
     */
    public static final int FOURTH_ROW = 3;
    /**
     * Last Row.
     */
    public static final int FIFTH_ROW = 4;
    
    /**
     * Creates application pane.
     */
    private GridPane pane;
    
    /**
     * Output message.
     */
    private Label output;
    

        
    /**
     * Constructs an object of type Telephone Pad.
     */
    public TelephonePad() {
        // Pane controls
        pane = new GridPane();
        output = new Label("");
        
        // Extra buttons
        Button star = new Button("*");
        Button pound = new Button("#");
        
        pound.setOnAction((event) -> {
            output.setText("#");
        });
        
        star.setOnAction((event) -> {
            output.setText("*");
        });
        
        // Adding controls
        pane.add(output, 1, FIRST_ROW);
        pane.add(star, 0, FIFTH_ROW);
        pane.add(pound, 2, FIFTH_ROW);
        
        
        
        // Number Buttons
        for (int i = 0; i <= BUTTONS; i++) {
            Button button = new Button("" + i);
            // Add numbers to pane
            if (i == 0) {
              pane.add(button, 1, FIFTH_ROW);  
            } else if (i <= ROW_LIMIT1) {
                pane.add(button, (i - 1), SECOND_ROW);
            } else if (i <= ROW_LIMIT2) {
                pane.add(button, (i - 1) - ROW_LIMIT1, THIRD_ROW);
            } else {
                pane.add(button, (i - 1) - ROW_LIMIT2, FOURTH_ROW);
            }
            
            
            
            // DO SUBSTRING!!!
            button.setOnAction((event) -> {
                output.setText(
                        event.getSource().toString().substring(
                        event.getSource().toString().length() - 2,
                        event.getSource().toString().length() - 1));
            });
        }
        
        /**
         * Aligns pane to center.
         */
        pane.setAlignment(Pos.CENTER);
        
        /**
         * Sends action event to the event handler when button is pressed.
         */
        /*button.setOnAction(this::buttonPress);*/
    }

    /**
     * Verifies if the passwords match.
     * @param event invokes this method.
     */
    public void buttonPress(ActionEvent event) {
        
    }
    
    /**
     * Launches the Telephone Pad window.
     * @see javafx.application.Application#start(javafx.stage.Stage)
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        final int appWidth = 500;
        final int appHeight = 500;
        Scene scene = new Scene(pane, appWidth, appHeight);
        primaryStage.setTitle("Telephone Pad");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Event Handler.
     * @see javafx.event.EventHandler#handle(javafx.event.Event)
     * @param event
     */
    @Override
    public void handle(Event event) {
        // TODO Auto-generated method stub
        
    }
    
}
