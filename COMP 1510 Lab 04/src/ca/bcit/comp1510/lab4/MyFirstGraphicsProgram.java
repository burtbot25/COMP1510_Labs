package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
/**
 * Demonstrates JavaFX functionalities.
 * @author Burt
 * @version 1.0
 */
public class MyFirstGraphicsProgram extends Application {

    /**
     * Width of the Window.
     */
    public static final int WINDOW_WIDTH = 500;
    
    /**
     * Height of the Window.
     */
    public static final int WINDOW_HEIGHT = 500;
    
    /**
     * Half of Window Width.
     */
    public static final int WINDOW_MID_WIDTH = 250;
    
    /**
     * Half of Window Height.
     */
    public static final int WINDOW_MID_HEIGHT = 250;
    
    /**
     * Radius of the Circle.
     */
    public static final int RADIUS = 100;
    
    /**
     * To translate the text in the X axis.
     */
    public static final int X_ADJUSTMENT = -20;
    
    /**
     * To translate the text in the Y axis.
     */
    public static final int Y_ADJUSTMENT = 5;
    
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Circle circle = new Circle(WINDOW_MID_WIDTH, WINDOW_MID_HEIGHT, RADIUS);
        circle.setFill(Color.GREEN);
        
        Text name = new Text(WINDOW_MID_WIDTH, WINDOW_MID_HEIGHT, "Wilburt");
        name.setTranslateX(X_ADJUSTMENT);
        name.setTranslateY(Y_ADJUSTMENT);
        name.setFill(Color.WHITE);
        
        Group root = new Group(circle, name);
        
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);

    }

}
