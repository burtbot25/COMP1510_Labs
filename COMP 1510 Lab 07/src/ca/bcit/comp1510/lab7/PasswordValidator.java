package ca.bcit.comp1510.lab7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 * PasswordValidator class.
 * @author Wilburt Herrera
 * @version 2017
 */
public class PasswordValidator extends Application {
    
    /**
     * Creates application pane.
     */
    private GridPane pane;
    
    /**
     * Password validation message.
     */
    private Text validText;
    
    /**
     * Submit button.
     */
    private Button submit;
    
    /**
     * Enter password label.
     */
    private Label enterPW;
    
    /**
     * Confirm password label.
     */
    private Label confirmPW;
    
    /**
     * Password field.
     */
    private TextField password;
    
    /**
     * Verify password field.
     */
    private TextField passwordConfirm;
    
    /**
     * Constructs an object of type PasswordValidator.
     */
    public PasswordValidator() {
        // Pane controls
        pane = new GridPane();
        enterPW = new Label("Enter Password:");
        confirmPW = new Label("Confirm Password: ");
        validText = new Text("");
        submit = new Button("Submit");
        password = new TextField();
        passwordConfirm = new TextField();
        
        /**
         * Password field place-holders.
         */
        password.setPromptText("password");
        passwordConfirm.setPromptText("password");
        
        // Labels
        pane.add(enterPW, 0, 0);
        pane.add(confirmPW, 0, 1);
        pane.add(validText, 1, 2);
        
        // Text Fields
        pane.add(password, 1, 0);
        pane.add(passwordConfirm, 1, 1);
        
        // Submit Button
        pane.add(submit, 0, 2);
        
        /**
         * Aligns pane to center.
         */
        pane.setAlignment(Pos.CENTER);
        
        /**
         * Sends action event to the event handler when submit is pressed.
         */
        submit.setOnAction(this::validator);
    }

    /**
     * Verifies if the passwords match.
     * @param event invokes this method.
     */
    public void validator(ActionEvent event) {
        
        /**
         * Retrieves text from text fields.
         */
        String original = password.getText();
        String verify = passwordConfirm.getText();
        
        /**
         * Verifies passwords.
         */
        if (original.equals(verify)) {
            validText.setText("Valid");
        } else {
            validText.setText("Invalid!");
        }
    }
    
    /**
     * Launches the password validator window.
     * @see javafx.application.Application#start(javafx.stage.Stage)
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        final int appWidth = 400;
        final int appHeight = 200;
        Scene scene = new Scene(pane, appWidth, appHeight);
        primaryStage.setTitle("Password Validator");
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

}
