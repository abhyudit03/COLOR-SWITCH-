package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import java.util.Random;

public class colorSwitcher  {
    Paint paint;
    double positionY=0;
    Paint color[];

    private Arc arc = new Arc(244.0,positionY , 16.0, 16.0, 90.0,90.0);

    private Arc arc1 = new Arc(244.0, positionY, 16.0, 16.0, 90.0, 90.0);

    private Arc arc2 = new Arc(244.0, positionY, 16.0, 16.0, 90.0, 90.0);

    private Arc arc3 = new Arc(244.0, positionY, 16.0, 16.0, 90.0, 90.0);


    public colorSwitcher(double positionY,Paint paint,Paint[] color){
        this.positionY=positionY;
        this.paint=paint;
        this.color=color;

        arc.setFill(Color.RED);
        arc.setStartAngle(0.0f);

        arc1.setFill(Color.CYAN);

        arc1.setStartAngle(90.0f);
        arc2.setFill(Color.PURPLE);
        arc2.setStartAngle(180.0f);
        arc3.setFill(Color.YELLOW);
        arc3.setStartAngle(270.0f);

        arc.setType(ArcType.ROUND);
        arc1.setType(ArcType.ROUND);
        arc2.setType(ArcType.ROUND);
        arc3.setType(ArcType.ROUND);

        arc.setCenterY(positionY);
        arc1.setCenterY(positionY);
        arc2.setCenterY(positionY);
        arc3.setCenterY(positionY);

    }

    public Arc getArc() {
        return arc;
    }

    public Arc getArc1() {
        return arc1;
    }

    public Arc getArc2() {
        return arc2;
    }

    public Arc getArc3() {
        return arc3;
    }

    public Paint colorChange(){

        Random rand=new Random();

        int rnum=rand.nextInt(color.length);

        while(color[rnum]==paint){
            rnum=rand.nextInt(color.length);
        }

        return color[rnum];

    }
    public void move(){
        TranslateTransition tans1 = new TranslateTransition();
        tans1.setByY(arc.getLayoutY()+80);
        tans1.setDuration(Duration.millis(600));
        tans1.setNode(arc);
        tans1.play();

        TranslateTransition tans2 = new TranslateTransition();
        tans2.setByY(arc1.getLayoutY()+80);
        tans2.setDuration(Duration.millis(600));
        tans2.setNode(arc1);
        tans2.play();

        TranslateTransition tans3 = new TranslateTransition();
        tans3.setByY(arc2.getLayoutY()+80);
        tans3.setDuration(Duration.millis(600));
        tans3.setNode(arc2);
        tans3.play();

        TranslateTransition tans4 = new TranslateTransition();
        tans4.setByY(arc3.getLayoutY()+80);
        tans4.setDuration(Duration.millis(600));
        tans4.setNode(arc3);
        tans4.play();
    }
    public void intersect1(Ball ball, Shape[] shapes){

        Shape shape1 = Shape.intersect(ball.getcircle(),arc);
        Shape shape2 = Shape.intersect(ball.getcircle(),arc1);
        shapes[0] = shape1;
        shapes[1] = shape2;


    }
    public void intersect2(Ball ball,Shape[] shapes1){

        Shape shape3 = Shape.intersect(ball.getcircle(),arc2);
        Shape shape4 = Shape.intersect(ball.getcircle(),arc3);
        shapes1[0] = shape3;
        shapes1[1] = shape4;

    }
    public int collisionDetection(Ball ball){
        Shape[] shapes1 = new Shape[2] ;
        Shape[] shapes2 = new Shape[2] ;
        intersect1(ball,shapes1);
        intersect2(ball,shapes2);

        if(shapes1[0].getLayoutBounds().getWidth()!=-1) {
            ball.getcircle().setFill(colorChange());
            return 1;
        }
        else if(shapes1[1].getLayoutBounds().getWidth()!=-1){
            ball.getcircle().setFill(colorChange());
            return 1;
        }
        else if(shapes2[0].getLayoutBounds().getWidth()!=-1){
            ball.getcircle().setFill(colorChange());
            return 1;
        }
        else if(shapes2[1].getLayoutBounds().getWidth()!=-1){
            ball.getcircle().setFill(colorChange());
            return 1;
        }
        return 0;


    }

}