package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class obstacle1 extends obstacle {
    private final int  id =1;
    private colorSwitcher colorSwitcher;
    private double speed;

    public colorSwitcher getColorSwitcher() {
        return colorSwitcher;
    }

    private final Star star;

    public Star getStar() {
        return star;
    }

    double positionY=getPosition_y();
    Paint[] color ={Color.CYAN,Color.RED,Color.PURPLE,Color.YELLOW};

    private Arc arc = new Arc(244.0, positionY, 100.0, 100.0, 360.0,90.0);

    private Arc arc1 = new Arc(244.0, positionY, 100.0, 100.0, 90.0, 90.0);

    private Arc arc2 = new Arc(244.0, positionY, 100.0, 100.0, 90.0, 90.0);

    private Arc arc3 = new Arc(244.0, positionY, 100.0, 100.0, 90.0, 90.0);

    public Arc getArc() {
        return arc;
    }

    public Arc getArc1() {
        return arc1;
    }

    public void animate(Arc arc,double speed){
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(speed), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() +360, Interpolator.LINEAR))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

    @Override
    public void move(){
//        System.out.println("jkl");
        star.move();
        colorSwitcher.move();
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
    @Override
    public void intersect1(Ball ball,Shape[] shapes){

        Shape shape1 = Shape.intersect(ball.getcircle(),arc);
        Shape shape2 = Shape.intersect(ball.getcircle(),arc1);
        shapes[0] = shape1;
        shapes[1] = shape2;


    }
    @Override
    public void intersect2(Ball ball,Shape[] shapes1){

        Shape shape3 = Shape.intersect(ball.getcircle(),arc2);
        Shape shape4 = Shape.intersect(ball.getcircle(),arc3);
        shapes1[0] = shape3;
        shapes1[1] = shape4;

    }
    @Override
    public int collisionDetection(Ball ball){
        Shape[] shapes1 = new Shape[2] ;
        Shape[] shapes2 = new Shape[2] ;
        intersect1(ball,shapes1);
        intersect2(ball,shapes2);

        if(shapes1[0].getLayoutBounds().getWidth()!=-1  ) {
            if(arc.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(shapes1[1].getLayoutBounds().getWidth()!=-1  ) {
//            System.out.println(shapes1[1].getStroke());
//            System.out.println(ball.getcircle().getFill());
            if(arc1.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(shapes2[0].getLayoutBounds().getWidth()!=-1  ) {
            if(arc2.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(shapes2[1].getLayoutBounds().getWidth()!=-1  ) {
            if(arc3.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        return 2;


    }

    @Override
    public double checkpos() {
        return arc.localToScene(0,0).getY();
    }

    @Override
    public void newpos() {
//        System.out.println("happppppy");
        arc.setLayoutY(positionY);
        arc1.setLayoutY(positionY);
        arc2.setLayoutY(positionY);
        arc3.setLayoutY(positionY);
        star.getPolygon1().setLayoutX(200);
        star.getPolygon2().setLayoutX(200);
        colorSwitcher.getArc().setLayoutY(positionY+70);
        colorSwitcher.getArc1().setLayoutY(positionY+70);
        colorSwitcher.getArc2().setLayoutY(positionY+70);
        colorSwitcher.getArc3().setLayoutY(positionY+70);
    }

    public obstacle1(AnchorPane anchorPane,Paint ballColor,double speed)  {
        star=new Star(positionY);
        anchorPane.getChildren().addAll(star.getPolygon1(),star.getPolygon2());
        double colorswitchpos=positionY+170;
        colorSwitcher=new colorSwitcher(colorswitchpos,ballColor,color);
//        Circle circle = new Circle(244.0, getPosition_y(), 85.0, Color.BLACK);
//        anchorPane.getChildren().addAll(star.getPolygon1(),star.getPolygon2());
        anchorPane.getChildren().addAll(colorSwitcher.getArc(),colorSwitcher.getArc1(),colorSwitcher.getArc2(),colorSwitcher.getArc3());
        arc.setStroke(Color.RED);

        arc.setStrokeWidth(20);
        arc.setStartAngle(0.0f);


        arc1.setStroke(Color.CYAN);
        arc1.setStrokeWidth(20);
        arc1.setStartAngle(90.0f);
        arc2.setStroke(Color.PURPLE);
        arc2.setStrokeWidth(20);
        arc2.setStartAngle(180.0f);
        arc3.setStrokeWidth(20);
        arc3.setStroke(Color.YELLOW);

        arc3.setStartAngle(270.0f);

        arc.setType(ArcType.OPEN);
        arc1.setType(ArcType.OPEN);
        arc2.setType(ArcType.OPEN);
        arc3.setType(ArcType.OPEN);

        anchorPane.getChildren().addAll(arc,arc1,arc2,arc3);
        animate(arc,speed);
        animate(arc1,speed);
        animate(arc2,speed);
        animate(arc3,speed);







    }




}
