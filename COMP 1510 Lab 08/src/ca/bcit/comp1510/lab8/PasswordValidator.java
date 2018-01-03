package ca.bcit.comp1510.lab8;

import java.io.FileNotFoundException;
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
     * Maximum password length.
     */
    public static final int MAXLENGTH = 10;
    
    /**
     * Minimum password length.
     */
    public static final int MINLENGTH = 8;
    
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
     * Holds original password.
     */
    private String original;
    
    /**
     * Holds verifying password.
     */
    private String verify;
    
    /**
     * ForbiddenWords object.
     */
    private ForbiddenWords wordlist;
    
    /**
     * Constructs an object of type PasswordValidator.
     * @throws FileNotFoundException 
     */
    public PasswordValidator() throws FileNotFoundException {
        // Pane controls
        pane = new GridPane();
        enterPW = new Label("Enter Password:");
        confirmPW = new Label("Confirm Password: ");
        validText = new Text("");
        submit = new Button("Submit");
        password = new TextField();
        passwordConfirm = new TextField();
        wordlist = new ForbiddenWords(
            "src/ca/bcit/comp1510/lab8/wordlists.txt");
        
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
        original = password.getText();
        verify = passwordConfirm.getText();
                                        
        /**
         * Verifies that the input password confirms to the rules
         */
        if (!original.equals(verify) || !(upperValidator(original)) 
                || !(lowerValidator(original)) 
                || !(numberValidator(original)) 
                || !(specialCharValidator(original)) 
                || !(lengthValidator(original))
                || (wordlist.containsWord(original))) {
            validText.setText("Invalid!");
        } else {
            validText.setText("Valid");
        }
        
        if (!upperValidator(original)) {
            validText.setText("Your password must contain an uppercase letter");
        }
        
        if (!lowerValidator(original)) {
            validText.setText("Your password must contain at "
                    + "least 1 lower case letter");
        }
        
        if (!numberValidator(original)) {
            validText.setText("Your password must contain at least 1 number");
        }
        
        if (!specialCharValidator(original)) {
            validText.setText("Your password must contain at least "
                    + "1 special character"
                    + "\n(i.e., ! \" # $ % & \' ( ) or *)");
        }
        
        if (!lengthValidator(original)) {
            validText.setText("Your password must be at least \n"
                    + MINLENGTH + " characters long but shorter \n" 
                    + "than " + MAXLENGTH + " characters");
        }
        
        if (!wordlist.containsWord(original)) {
            validText.setText("Your password is forbidden");
        }
        
    } // end of action event
    
    /**
     * Checks for a capital letter in the password by comparing the String's
     * individual characters with the ASCII table.
     * @param userInput a String.
     * @return a boolean.
     */
    private boolean upperValidator(String userInput) {
        
        char[] letters = userInput.toCharArray();
        for (char character : letters) {
            if (character >= 'A' && character <= 'Z') {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks for a capital letter in the password by comparing the String's
     * individual characters with the ASCII table.
     * @param userInput a String.
     * @return a boolean.
     */
     private boolean lowerValidator(String userInput) {
        
        char[] letters = userInput.toCharArray();
        for (char character : letters) {
            if (character >= 'a' && character <= 'z') {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks for a number in the password by comparing the String's
     * individual characters with the ASCII table.
     * @param userInput a String.
     * @return a boolean.
     */
    private boolean numberValidator(String userInput) {
        
        char[] letters = userInput.toCharArray();
        for (char character : letters) {
            if (character >= '0' && character <= '9') {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks for a special character(i.e., ! " # $ % & ' ( ) or *)
     * in the password  by comparing the String's
     * individual characters with the ASCII table.
     * @param userInput a String.
     * @return a boolean.
     */
    private boolean specialCharValidator(String userInput) {
        
        char[] letters = userInput.toCharArray();
        for (char character : letters) {
            if (character >= '!' && character <= '*') {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks that the password is at least 8 characters but less than 10.
     * @param userInput a String.
     * @return a boolean.
     */
    private boolean lengthValidator(String userInput) {
        
        if (userInput.length() >= MINLENGTH 
                && userInput.length() <= MAXLENGTH) {
            return true;
        }
        return false;
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
