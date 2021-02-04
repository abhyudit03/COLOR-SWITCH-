package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class obstacle2 extends obstacle{
    private final int  id =2;
    private final Paint ballColor;
    private  colorSwitcher colorSwitcher;
    private double speed;
    public colorSwitcher getColorSwitcher() {
        return colorSwitcher;
    }
    public Star getStar() {
        return star;
    }

    Star star;
    Paint color[]={Color.CYAN,Color.RED,Color.PURPLE,Color.YELLOW};
    private Line line1=new Line();
    private Line line2=new Line();
    private Line line3=new Line();
    private Line line4=new Line();

    double positionY=getPosition_y()-50;

    public Line getLine1() {
        return line1;
    }

    public void animate(Line line, double pivotX, double pivotY,double speed){

        Rotate rotate = new Rotate(0,pivotX, pivotY);
        line.getTransforms().add(rotate);

        Timeline animation=new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(speed), new KeyValue(rotate.angleProperty(), 360))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }
    @Override
    public void intersect1(Ball ball, Shape[] shapes){

        Shape shape1 = Shape.intersect(ball.getcircle(),line1);
        Shape shape2 = Shape.intersect(ball.getcircle(),line2);
        shapes[0] = shape1;
        shapes[1] = shape2;


    }
    @Override
    public void intersect2(Ball ball,Shape[] shapes1){

        Shape shape3 = Shape.intersect(ball.getcircle(),line3);
        Shape shape4 = Shape.intersect(ball.getcircle(),line4);
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
            if(line1.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(shapes1[1].getLayoutBounds().getWidth()!=-1  ) {
//            System.out.println(shapes1[1].getStroke());
//            System.out.println(ball.getcircle().getFill());
            if(line2.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(shapes2[0].getLayoutBounds().getWidth()!=-1  ) {
            if(line3.getStroke()!=ball.getcircle().getFill()) {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(shapes2[1].getLayoutBounds().getWidth()!=-1  ) {
            if(line4.getStroke()!=ball.getcircle().getFill()) {
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
        return line1.localToScene(0,0).getY();
    }

    @Override
    public void newpos() {
        line1.setLayoutY(positionY);
        line2.setLayoutY(positionY);
        line3.setLayoutY(positionY);
        line4.setLayoutY(positionY);
        star.getPolygon1().setLayoutY(positionY+75);
        star.getPolygon2().setLayoutY(positionY+75);
        colorSwitcher.getArc().setLayoutY(positionY+60);
        colorSwitcher.getArc1().setLayoutY(positionY+60);
        colorSwitcher.getArc2().setLayoutY(positionY+60);
        colorSwitcher.getArc3().setLayoutY(positionY+60);

    }

    @Override
    public void move(){
//        System.out.println("jkl");
        star.move();
        colorSwitcher.move();
        TranslateTransition tans1 = new TranslateTransition();
        tans1.setByY(line1.getLayoutY()+80);
        tans1.setDuration(Duration.millis(600));
        tans1.setNode(line1);
        tans1.play();

        TranslateTransition tans2 = new TranslateTransition();
        tans2.setByY(line2.getLayoutY()+80);
        tans2.setDuration(Duration.millis(600));
        tans2.setNode(line2);
        tans2.play();

        TranslateTransition tans3 = new TranslateTransition();
        tans3.setByY(line3.getLayoutY()+80);
        tans3.setDuration(Duration.millis(600));
        tans3.setNode(line3);
        tans3.play();

        TranslateTransition tans4 = new TranslateTransition();
        tans4.setByY(line4.getLayoutY()+80);
        tans4.setDuration(Duration.millis(600));
        tans4.setNode(line4);
        tans4.play();



    }
    public obstacle2(AnchorPane anchorPane, Paint ballColor,double speed){
        this.ballColor = ballColor;
        star=new Star(positionY+75);
        anchorPane.getChildren().addAll(star.getPolygon1(),star.getPolygon2());
        double colorswitchpos=positionY+250;
        colorSwitcher=new colorSwitcher(colorswitchpos,ballColor,color);
//        anchorPane.getChildren().addAll(star.getPolygon1(),star.getPolygon2());
        anchorPane.getChildren().addAll(colorSwitcher.getArc(),colorSwitcher.getArc1(),colorSwitcher.getArc2(),colorSwitcher.getArc3());

        line1.setStartX(170);
        line1.setStartY(positionY);
        line1.setEndX(320);
        line1.setEndY(positionY);
        line1.setStrokeLineCap(StrokeLineCap.ROUND);

        line2.setStartX(170);
        line2.setStartY(positionY);
        line2.setEndX(170);
        line2.setEndY(positionY+150);
        line2.setStrokeLineCap(StrokeLineCap.ROUND);


        line3.setStartX(320);
        line3.setStartY(positionY);
        line3.setEndX(320);
        line3.setEndY(positionY+150);
        line3.setStrokeLineCap(StrokeLineCap.ROUND);


        line4.setStartX(170);
        line4.setStartY(positionY+150);
        line4.setEndX(320);
        line4.setEndY(positionY+150);
        line4.setStrokeLineCap(StrokeLineCap.ROUND);



        line1.setStroke(Color.CYAN);
        line2.setStroke(Color.PURPLE);
        line3.setStroke(Color.RED);
        line4.setStroke(Color.YELLOW);

        line1.setStrokeWidth(15);
        line2.setStrokeWidth(15);
        line3.setStrokeWidth(15);
        line4.setStrokeWidth(15);

        anchorPane.getChildren().addAll(line1,line2,line3,line4);

        double pivotX=(line1.getEndX()+line1.getStartX())/2;
        //System.out.println("line1"+ line1.getEndX()+"-"+line1.getStartX()+"-"+line1.getStartY()+"-"+line4.getStartY());
        double pivotY1=(line1.getStartY()+75);
        double pivotY2=(line2.getStartY()+75);
        double pivotY3=(line3.getStartY()+75);
        double pivotY4=(line4.getStartY()-75);


        animate(line1,pivotX,pivotY1,speed);
        animate(line2,pivotX,pivotY2,speed);
        animate(line3,pivotX,pivotY3,speed);
        animate(line4,pivotX,pivotY4,speed);

    }


}