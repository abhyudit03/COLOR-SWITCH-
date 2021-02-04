package sample;


import javafx.animation.TranslateTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineJoin;
import javafx.util.Duration;

public class Star {

    private Polygon polygon1;
    private Polygon polygon2;

    double positionY;

    public void move(){
//        System.out.println("jkl");
        TranslateTransition tans1 = new TranslateTransition();
        tans1.setByY(polygon1.getLayoutY()+80);
        tans1.setDuration(Duration.millis(600));
        tans1.setNode(polygon1);
        tans1.play();

        TranslateTransition tans2 = new TranslateTransition();
        tans2.setByY(polygon2.getLayoutY()+80);
        tans2.setDuration(Duration.millis(600));
        tans2.setNode(polygon2);
        tans2.play();

    }
    public void intersect1(Ball ball, Shape[] shapes){

        Shape shape1 = Shape.intersect(ball.getcircle(),polygon1);
        Shape shape2 = Shape.intersect(ball.getcircle(),polygon2);
        shapes[0] = shape1;
        shapes[1] = shape2;


    }

    public int collisionDetection(Ball ball){
        Shape[] shapes1 = new Shape[2] ;

        intersect1(ball,shapes1);


        if(shapes1[0].getLayoutBounds().getWidth()!=-1  ) {
            return 1;
        }
        if(shapes1[1].getLayoutBounds().getWidth()!=-1  ) {
          return 1;
        }
        return 0;


    }
    public Star(double positionY){
        this.positionY=positionY;

        double point[]={242,positionY-20,222,positionY+15,262,positionY+15};
        polygon1=new Polygon(point);
        polygon1.setFill(Color.WHITESMOKE);
        polygon1.setStrokeLineJoin(StrokeLineJoin.ROUND);

        double point1[]={242,positionY+25,222,positionY-8,262,positionY-8};
        polygon2=new Polygon(point1);
        polygon2.setFill(Color.WHITESMOKE);
        polygon2.setStrokeLineJoin(StrokeLineJoin.ROUND);




    }

    public Polygon getPolygon1() {
        return polygon1;
    }

    public Polygon getPolygon2() {
        return polygon2;
    }
}