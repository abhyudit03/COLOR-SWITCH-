package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class obstacle5 extends obstacle{
    private final int  id =5;
    private colorSwitcher colorSwitcher;
    private double speed;
    public colorSwitcher getColorSwitcher() {
        return colorSwitcher;
    }

    Star star;
    public Star getStar() {
        return star;
    }
    private final Paint ballColor;
    double positionY = getPosition_y();

    //only CYAN and YELLOW can pass.
    // new arc(centre x,centre y, radius x,radius y,start angle,length)
    Paint color[]={Color.CYAN,Color.YELLOW};

    private Arc circle1arc1 = new Arc(244.0, positionY, 120.0, 120.0, 90.0,90.0);

    private Arc circle1arc2 = new Arc(244.0, positionY, 120.0, 120.0, 90.0, 90.0);

    private Arc circle1arc3 = new Arc(244.0, positionY, 120.0, 120.0, 90.0, 90.0);

    private Arc circle1arc4 = new Arc(244.0, positionY, 120.0, 120.0, 90.0, 90.0);

    private Arc circle2arc1 = new Arc(244.0, positionY, 96.0, 96.0, 90.0,90.0);

    private Arc circle2arc2 = new Arc(244.0, positionY, 96.0, 96.0, 90.0, 90.0);

    private Arc circle2arc3 = new Arc(244.0,positionY, 96.0, 96.0, 90.0, 90.0);

    private Arc circle2arc4 = new Arc(244.0, positionY, 96.0, 96.0, 90.0, 90.0);

    private Arc circle3arc1 = new Arc(244.0, positionY, 75.0, 75.0, 90.0,90.0);

    private Arc circle3arc2 = new Arc(244.0, positionY, 75.0, 75.0, 90.0, 90.0);

    private Arc circle3arc3 = new Arc(244.0, positionY, 75.0, 75.0, 90.0, 90.0);

    private Arc circle3arc4 = new Arc(244.0, positionY, 75.0, 75.0, 90.0, 90.0);

    public Arc getCircle1arc1() {
        return circle1arc1;
    }

    @Override
    public void intersect1(Ball ball, Shape[] shapes){
//        Shape[] shapes = new Shape[8];
        Shape shape1 = Shape.intersect(circle1arc1,ball.getcircle());
        Shape shape2 = Shape.intersect(circle1arc2,ball.getcircle());
        Shape shape3 = Shape.intersect(circle1arc3,ball.getcircle());
        Shape shape4 = Shape.intersect(circle1arc1,ball.getcircle());
        Shape shape5 = Shape.intersect(circle3arc1,ball.getcircle());
        Shape shape6 = Shape.intersect(circle3arc2,ball.getcircle());
        Shape shape7 = Shape.intersect(circle3arc3,ball.getcircle());
        Shape shape8 = Shape.intersect(circle3arc4,ball.getcircle());

        shapes[0] = shape1;
        shapes[1] = shape2;
        shapes[2]= shape3;
        shapes[3] = shape4;
        shapes[4] = shape5;
        shapes[5] = shape6;
        shapes[6]= shape7;
        shapes[7] = shape8;

    }
    @Override
    public void intersect2(Ball ball,Shape[] shapes){

        Shape shape3 = Shape.intersect(ball.getcircle(),circle2arc1);
        Shape shape4 = Shape.intersect(ball.getcircle(),circle2arc2);
        Shape shape = Shape.intersect(ball.getcircle(),circle2arc3);
        Shape shapp = Shape.intersect(ball.getcircle(),circle2arc4);
        shapes[0] = shape3;
        shapes[1] = shape4;
        shapes[2] =shape;
        shapes[3] = shapp;
    }
    @Override
    public int collisionDetection(Ball ball){
        Shape[] shapes1 = new Shape[8];
        Shape[] shapes2 = new Shape[4];
        intersect1(ball,shapes1);
        intersect2(ball,shapes2);
        if(shapes1[0].getLayoutBounds().getWidth()!=-1 && circle1arc1.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[0].getLayoutBounds().getWidth()!=-1 && circle1arc1.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[1].getLayoutBounds().getWidth()!=-1 && circle1arc2.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[1].getLayoutBounds().getWidth()!=-1 && circle1arc2.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[2].getLayoutBounds().getWidth()!=-1 && circle1arc3.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[2].getLayoutBounds().getWidth()!=-1 && circle1arc3.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[3].getLayoutBounds().getWidth()!=-1 && circle1arc4.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[3].getLayoutBounds().getWidth()!=-1 && circle1arc4.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[4].getLayoutBounds().getWidth()!=-1 && circle3arc1.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[4].getLayoutBounds().getWidth()!=-1 && circle3arc1.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[5].getLayoutBounds().getWidth()!=-1 && circle3arc2.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[5].getLayoutBounds().getWidth()!=-1 && circle3arc2.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[6].getLayoutBounds().getWidth()!=-1 && circle3arc3.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[6].getLayoutBounds().getWidth()!=-1 && circle3arc3.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes1[7].getLayoutBounds().getWidth()!=-1 && circle3arc4.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes1[7].getLayoutBounds().getWidth()!=-1 && circle3arc4.getStroke()==ball.getcircle().getFill()){
            return 0;
        }

        if(shapes2[0].getLayoutBounds().getWidth()!=-1 && circle2arc1.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes2[0].getLayoutBounds().getWidth()!=-1 && circle2arc1.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes2[1].getLayoutBounds().getWidth()!=-1 && circle2arc2.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes2[1].getLayoutBounds().getWidth()!=-1 && circle2arc2.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes2[2].getLayoutBounds().getWidth()!=-1 && circle2arc3.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes2[2].getLayoutBounds().getWidth()!=-1 && circle2arc3.getStroke()==ball.getcircle().getFill()){
            return 0;
        }
        if(shapes2[3].getLayoutBounds().getWidth()!=-1 && circle2arc4.getStroke()!=ball.getcircle().getFill()) {

            return 1;
        }
        if (shapes2[3].getLayoutBounds().getWidth()!=-1 && circle2arc4.getStroke()==ball.getcircle().getFill()){
            return 0;
        }

        return 2;


    }

    @Override
    public double checkpos() {
        return circle1arc1.localToScene(0,0).getY();
    }

    @Override
    public void newpos() {
        circle1arc1.setLayoutY(positionY);
        circle1arc2.setLayoutY(positionY);
        circle1arc3.setLayoutY(positionY);
        circle1arc4.setLayoutY(positionY);

        circle2arc1.setLayoutY(positionY);
        circle2arc2.setLayoutY(positionY);
        circle2arc3.setLayoutY(positionY);
        circle2arc4.setLayoutY(positionY);

        circle2arc1.setLayoutY(positionY);
        circle2arc2.setLayoutY(positionY);
        circle2arc3.setLayoutY(positionY);
        circle2arc4.setLayoutY(positionY);

        star.getPolygon1().setLayoutX(positionY);
        star.getPolygon2().setLayoutX(positionY);
        colorSwitcher.getArc().setLayoutY(positionY+50);
        colorSwitcher.getArc1().setLayoutY(positionY+50);
        colorSwitcher.getArc2().setLayoutY(positionY+50);
        colorSwitcher.getArc3().setLayoutY(positionY+50);
    }

    public void animate(Arc arc,double speed){
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(speed), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() +360, Interpolator.LINEAR))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }
    public void animateAnti(Arc arc,double speed){
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(speed), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() -360, Interpolator.LINEAR))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }
    @Override
    public void move(){
        star.move();
        colorSwitcher.move();
        TranslateTransition tans1 = new TranslateTransition();
        tans1.setByY(circle1arc1.getLayoutY()+80);
        tans1.setDuration(Duration.millis(600));
        tans1.setNode(circle1arc1);
        tans1.play();

        TranslateTransition tans2 = new TranslateTransition();
        tans2.setByY(circle1arc2.getLayoutY()+80);
        tans2.setDuration(Duration.millis(600));
        tans2.setNode(circle1arc2);
        tans2.play();

        TranslateTransition tans3 = new TranslateTransition();
        tans3.setByY(circle1arc3.getLayoutY()+80);
        tans3.setDuration(Duration.millis(600));
        tans3.setNode(circle1arc3);
        tans3.play();

        TranslateTransition tans4 = new TranslateTransition();
        tans4.setByY(circle1arc4.getLayoutY()+80);
        tans4.setDuration(Duration.millis(600));
        tans4.setNode(circle1arc4);
        tans4.play();

        TranslateTransition tans5 = new TranslateTransition();
        tans5.setByY(circle2arc1.getLayoutY()+80);
        tans5.setDuration(Duration.millis(600));
        tans5.setNode(circle2arc1);
        tans5.play();

        TranslateTransition tans6 = new TranslateTransition();
        tans6.setByY(circle2arc2.getLayoutY()+80);
        tans6.setDuration(Duration.millis(600));
        tans6.setNode(circle2arc2);
        tans6.play();

        TranslateTransition tans7 = new TranslateTransition();
        tans7.setByY(circle2arc3.getLayoutY()+80);
        tans7.setDuration(Duration.millis(600));
        tans7.setNode(circle2arc3);
        tans7.play();

        TranslateTransition tans8 = new TranslateTransition();
        tans8.setByY(circle2arc4.getLayoutY()+80);
        tans8.setDuration(Duration.millis(600));
        tans8.setNode(circle2arc4);
        tans8.play();

        TranslateTransition tans9 = new TranslateTransition();
        tans9.setByY(circle3arc1.getLayoutY()+80);
        tans9.setDuration(Duration.millis(600));
        tans9.setNode(circle3arc1);
        tans9.play();

        TranslateTransition tans10 = new TranslateTransition();
        tans10.setByY(circle3arc2.getLayoutY()+80);
        tans10.setDuration(Duration.millis(600));
        tans10.setNode(circle3arc2);
        tans10.play();

        TranslateTransition tans11 = new TranslateTransition();
        tans11.setByY(circle3arc3.getLayoutY()+80);
        tans11.setDuration(Duration.millis(600));
        tans11.setNode(circle3arc3);
        tans11.play();

        TranslateTransition tans12 = new TranslateTransition();
        tans12.setByY(circle3arc4.getLayoutY()+80);
        tans12.setDuration(Duration.millis(600));
        tans12.setNode(circle3arc4);
        tans12.play();


    }


    public obstacle5(AnchorPane anchorPane,Paint ballColor,double speed)  {
        this.ballColor = ballColor;
        star=new Star(positionY);
        anchorPane.getChildren().addAll(star.getPolygon1(),star.getPolygon2());
        double colorswitchpos=positionY+250;
        colorSwitcher=new colorSwitcher(colorswitchpos,ballColor,color);
//        anchorPane.getChildren().addAll(star.getPolygon1(),star.getPolygon2());
        anchorPane.getChildren().addAll(colorSwitcher.getArc(),colorSwitcher.getArc1(),colorSwitcher.getArc2(),colorSwitcher.getArc3());

        circle1arc1.setStroke(Color.RED);
        circle1arc1.setStartAngle(90.0f);
        circle1arc1.setStrokeWidth(20);

        circle1arc2.setStroke(Color.CYAN);
        circle1arc2.setStartAngle(180.0f);
        circle1arc2.setStrokeWidth(20);

        circle1arc3.setStroke(Color.PURPLE);
        circle1arc3.setStartAngle(270.0f);
        circle1arc3.setStrokeWidth(20);

        circle1arc4.setStroke(Color.YELLOW);
        circle1arc4.setStartAngle(0.0f);
        circle1arc4.setStrokeWidth(20);

        circle1arc1.setType(ArcType.OPEN);
        circle1arc2.setType(ArcType.OPEN);
        circle1arc3.setType(ArcType.OPEN);
        circle1arc4.setType(ArcType.OPEN);

        circle2arc1.setStroke(Color.RED);
        circle2arc1.setStartAngle(90.0f);
        circle2arc1.setStrokeWidth(15);

        circle2arc2.setStroke(Color.CYAN);
        circle2arc2.setStartAngle(180.0f);
        circle2arc2.setStrokeWidth(15);

        circle2arc3.setStroke(Color.PURPLE);
        circle2arc3.setStartAngle(270.0f);
        circle2arc3.setStrokeWidth(15);

        circle2arc4.setStroke(Color.YELLOW);
        circle2arc4.setStartAngle(0.0f);
        circle2arc4.setStrokeWidth(15);

        circle2arc1.setType(ArcType.OPEN);
        circle2arc2.setType(ArcType.OPEN);
        circle2arc3.setType(ArcType.OPEN);
        circle2arc4.setType(ArcType.OPEN);

        circle3arc1.setStroke(Color.RED);
        circle3arc1.setStartAngle(180.0f);
        circle3arc1.setStrokeWidth(12);

        circle3arc2.setStroke(Color.CYAN);
        circle3arc2.setStartAngle(270.0f);
        circle3arc2.setStrokeWidth(12);

        circle3arc3.setStroke(Color.PURPLE);
        circle3arc3.setStartAngle(0.0f);
        circle3arc3.setStrokeWidth(12);

        circle3arc4.setStroke(Color.YELLOW);
        circle3arc4.setStartAngle(90.0f);
        circle3arc4.setStrokeWidth(12);

        circle3arc1.setType(ArcType.OPEN);
        circle3arc2.setType(ArcType.OPEN);
        circle3arc3.setType(ArcType.OPEN);
        circle3arc4.setType(ArcType.OPEN);

        anchorPane.getChildren().addAll(circle1arc1, circle1arc2, circle1arc3, circle1arc4);
        //anchorPane.getChildren().addAll(circle1);
        anchorPane.getChildren().addAll(circle2arc1,circle2arc2,circle2arc3,circle2arc4);
        //anchorPane.getChildren().addAll(circle2);
        anchorPane.getChildren().addAll(circle3arc1,circle3arc2,circle3arc3,circle3arc4);
        //anchorPane.getChildren().addAll(circle3);



        animate(circle1arc1,speed);
        animate(circle1arc2,speed);
        animate(circle1arc3,speed);
        animate(circle1arc4,speed);


        animate(circle2arc1,speed);
        animate(circle2arc2,speed);
        animate(circle2arc3,speed);
        animate(circle2arc4,speed);

        animateAnti(circle3arc1,speed);
        animateAnti(circle3arc2,speed);
        animateAnti(circle3arc3,speed);
        animateAnti(circle3arc4,speed);






    }



}