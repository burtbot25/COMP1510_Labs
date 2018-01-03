package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 * Displays my self-portrait.
 * @author Wilburt
 * @version 1.0
 */
public class Face extends Application {
    
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        final Ellipse face = new Ellipse(250, 250, 100, 130);
        face.setFill(Color.rgb(255, 215, 156));
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(2);
        
        final Arc leftEar = new Arc(151, 250, 20, 20, 90, 180);
        leftEar.setType(ArcType.OPEN);
        leftEar.setStroke(Color.BLACK);
        leftEar.setFill(Color.rgb(255, 215, 156));
        leftEar.setStrokeWidth(2);
        
        final Arc rightEar = new Arc(349, 250, 20, 20, 90, -180);
        rightEar.setType(ArcType.OPEN);
        rightEar.setStroke(Color.BLACK);
        rightEar.setFill(Color.rgb(255, 215, 156));
        rightEar.setStrokeWidth(2);
        
        final Arc mouth = new Arc(250, 300, 40, 40, 0, -180);
        mouth.setType(ArcType.CHORD);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.RED);
        
        final Circle eye1 = new Circle(200, 230, 10);
        eye1.setFill(Color.BLACK);
        eye1.setStroke(Color.BLACK);
        
        final Circle eye2 = new Circle(300, 230, 10);
        eye2.setFill(Color.BLACK);
        eye2.setStroke(Color.BLACK);
        
        final Circle eye3 = new Circle(195, 230, 4);
        eye1.setFill(Color.WHITE);
        eye1.setStroke(Color.BLACK);
        
        final Circle eye4 = new Circle(295, 230, 4);
        eye2.setFill(Color.WHITE);
        eye2.setStroke(Color.BLACK);
        
        final Arc brow1 = new Arc(200, 210, 15, 15, 0, 180);
        brow1.setType(ArcType.OPEN);
        brow1.setStroke(Color.BLACK);
        brow1.setFill(null);
        
        final Arc brow2 = new Arc(300, 210, 15, 15, 0, 180);
        brow2.setType(ArcType.OPEN);
        brow2.setStroke(Color.BLACK);
        brow2.setFill(null);
        
        final Circle earring1 = new Circle(145, 260, 3);
        earring1.setFill(Color.BLACK);
        earring1.setStroke(Color.BLACK);
        
        final Circle earring2 = new Circle(355, 260, 3);
        earring2.setFill(Color.BLACK);
        earring2.setStroke(Color.BLACK);
        
        final Arc hairSide = new Arc(328, 200, 33, 40, 100, -150);
        hairSide.setType(ArcType.CHORD);
        hairSide.setStroke(Color.BLACK);
        hairSide.setFill(Color.BLACK);
        
        final Arc hairTop = new Arc(244, 170, 60, 125, 45, 180);
        hairTop.setType(ArcType.CHORD);
        hairTop.setStroke(Color.BLACK);
        hairTop.setFill(Color.BLACK);
        hairTop.setRotate(60);
        
        final Line noseTop = new Line(240, 240, 230, 260);
        noseTop.setStroke(Color.BLACK);
        noseTop.setStrokeWidth(2);
        
        final Line noseBottom = new Line(230, 260, 240, 260);
        noseBottom.setStroke(Color.BLACK);
        noseBottom.setStrokeWidth(2);
        
        Group root = new Group(face, leftEar, rightEar, mouth, eye1, 
                eye2, eye3, eye4, brow1, brow2, earring1, earring2, 
                hairSide, hairTop, noseTop, noseBottom);
        
        Scene scene = new Scene(root, 500, 500);

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
