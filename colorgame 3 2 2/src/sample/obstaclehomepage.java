package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class obstaclehomepage {

    // new arc(centre x,centre y, radius x,radius y,start angle,length)

    private Arc circle1arc1 = new Arc(244.0, 267.0, 113.0, 113.0, 90.0,90.0);

    private Arc circle1arc2 = new Arc(244.0, 267.0, 113.0, 113.0, 90.0, 90.0);

    private Arc circle1arc3 = new Arc(244.0, 267.0, 113.0, 113.0, 90.0, 90.0);

    private Arc circle1arc4 = new Arc(244.0, 267.0, 113.0, 113.0, 90.0, 90.0);

    private Arc circle2arc1 = new Arc(244.0, 267.0, 86.0, 86.0, 90.0,90.0);

    private Arc circle2arc2 = new Arc(244.0, 267.0, 86.0, 86.0, 90.0, 90.0);

    private Arc circle2arc3 = new Arc(244.0, 267.0, 86.0, 86.0, 90.0, 90.0);

    private Arc circle2arc4 = new Arc(244.0, 267.0, 86.0, 86.0, 90.0, 90.0);

    private Arc circle3arc1 = new Arc(244.0, 267.0, 65.0, 65.0, 90.0,90.0);

    private Arc circle3arc2 = new Arc(244.0, 267.0, 65.0, 65.0, 90.0, 90.0);

    private Arc circle3arc3 = new Arc(244.0, 267.0, 65.0, 65.0, 90.0, 90.0);

    private Arc circle3arc4 = new Arc(244.0, 267.0, 65.0, 65.0, 90.0, 90.0);


    public void animate(Arc arc){
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(4), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() +360, Interpolator.LINEAR))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }
    public void animateAnti(Arc arc){
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(4), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() -360, Interpolator.LINEAR))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

    public obstaclehomepage(AnchorPane anchorPane)  {


        Circle circle1 = new Circle(244.0, 267.0, 92.0, Color.BLACK);
        Circle circle2 = new Circle(244.0, 267.0, 71.0, Color.BLACK);
        Circle circle3 = new Circle(244.0, 267.0, 53.0, Color.BLACK);
        circle1arc1.setFill(Color.CYAN);
        circle1arc1.setStartAngle(0.0f);
        circle1arc2.setFill(Color.PURPLE);
        circle1arc2.setStartAngle(90.0f);
        circle1arc3.setFill(Color.RED);
        circle1arc3.setStartAngle(180.0f);
        circle1arc4.setFill(Color.YELLOW);
        circle1arc4.setStartAngle(270.0f);

        circle1arc1.setType(ArcType.ROUND);
        circle1arc2.setType(ArcType.ROUND);
        circle1arc3.setType(ArcType.ROUND);
        circle1arc4.setType(ArcType.ROUND);

        circle2arc1.setFill(Color.CYAN);
        circle2arc1.setStartAngle(0.0f);
        circle2arc2.setFill(Color.PURPLE);
        circle2arc2.setStartAngle(90.0f);
        circle2arc3.setFill(Color.RED);
        circle2arc3.setStartAngle(180.0f);
        circle2arc4.setFill(Color.YELLOW);
        circle2arc4.setStartAngle(270.0f);

        circle2arc1.setType(ArcType.ROUND);
        circle2arc2.setType(ArcType.ROUND);
        circle2arc3.setType(ArcType.ROUND);
        circle2arc4.setType(ArcType.ROUND);

        circle3arc1.setFill(Color.YELLOW);
        circle3arc1.setStartAngle(180.0f);
        circle3arc2.setFill(Color.CYAN);
        circle3arc2.setStartAngle(270.0f);
        circle3arc3.setFill(Color.PURPLE);
        circle3arc3.setStartAngle(0.0f);
        circle3arc4.setFill(Color.RED);
        circle3arc4.setStartAngle(90.0f);

        circle3arc1.setType(ArcType.ROUND);
        circle3arc2.setType(ArcType.ROUND);
        circle3arc3.setType(ArcType.ROUND);
        circle3arc4.setType(ArcType.ROUND);

        anchorPane.getChildren().addAll(circle1arc1, circle1arc2, circle1arc3, circle1arc4);
        anchorPane.getChildren().addAll(circle1);
        anchorPane.getChildren().addAll(circle2arc1,circle2arc2,circle2arc3,circle2arc4);
        anchorPane.getChildren().addAll(circle2);
        anchorPane.getChildren().addAll(circle3arc1,circle3arc2,circle3arc3,circle3arc4);
        anchorPane.getChildren().addAll(circle3);


        animateAnti(circle1arc1);
        animateAnti(circle1arc2);
        animateAnti(circle1arc3);
        animateAnti(circle1arc4);

        animate(circle2arc1);
        animate(circle2arc2);
        animate(circle2arc3);
        animate(circle2arc4);

        animateAnti(circle3arc1);
        animateAnti(circle3arc2);
        animateAnti(circle3arc3);
        animateAnti(circle3arc4);







    }



}
