package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.util.Random;

public class Ball {

    private Scene scene;

    private double positionY;
    private Paint color;
    private final int  positionX=244;
    private final int radius =10;
    private static Circle circle;
    private double gravity=10;

    Timeline animationUp;
    Timeline animationDown;
    static SequentialTransition move;



    public Ball(Paint color, double positionY, Scene scene){
        circle=new Circle();
        this.positionY=positionY;
        this.color=color;

        //circle.setCenterX(positionX);
        //circle.setCenterY(positionY);
        circle.relocate(positionX,positionY);
        circle.setRadius(radius);
        circle.setFill(color);
//        circle.setStroke(color);
        this.scene=scene;

    }
    public static Circle getcircle(){
        return circle;
    }

    boolean flag=true;

    public int randomize(){

        Random rand = new Random();
        int random=rand.nextInt(18);
        return random;
    }
    public static obstacle obShow[]=new obstacle[3];
    private obstacle outofscene;


    public void setObstacle(int number,obstacle[] obstacle){
        obShow[number]=obstacle[randomize()];

    }

    public void moveObstacle(obstacle[] arr,obstacle obs){

        obs.move();
        //setObstacle();




    }
    public void setnewpos(obstacle ob)
    {
        ob.newpos();
    }



    public int moveball(Ball ball,obstacle[] obstacle){

            setObstacle(0, obstacle);
            setObstacle(1, obstacle);
            setObstacle(2, obstacle);

            ball.getcircle().setLayoutY(ball.getcircle().getLayoutY() + gravity);
            scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
                int down;



                    if ( event.getCode() == KeyCode.SPACE ) {

                        animationUp = new Timeline(
                                new KeyFrame(Duration.millis(300),
                                        new KeyValue(circle.layoutYProperty(), circle.getLayoutY() - 50))
                        );

                        if ( circle.getLayoutY() < 450 ) {
                            if ( circle.getLayoutY() > 250 ) {
                                down = 2000;
                                animationDown = new Timeline(

                                        new KeyFrame(Duration.millis(down),

                                                new KeyValue(circle.layoutYProperty(), 600))
                                );

                                move = new SequentialTransition(animationUp, animationDown);
                                move.play();
                            }

                            moveObstacle(obstacle, obShow[0]);
                            //System.out.println(obShow[0].checkpos());
                            //System.out.println(obShow[0].getLayoutX() + "-");
                            boolean flag = false;
                            if ( obShow[0].checkpos() > 500 ) {
                                moveObstacle(obstacle, obShow[1]);

                                if ( obShow[1].checkpos() > 500 ) {
                                    moveObstacle(obstacle, obShow[2]);

                                }

                                if ( obShow[0].checkpos() > 1200 ) {
                                    //obShow[0].newpos();
                                    obShow[0] = obShow[1];

                                    obShow[1] = obShow[2];
                                    setObstacle(2, obstacle);
                                }
                            }


                        } else if ( circle.getLayoutY() > 450 ) {
                            down = 1000;
                            animationDown = new Timeline(

                                    new KeyFrame(Duration.millis(down),

                                            new KeyValue(circle.layoutYProperty(), 600))
                            );

                            move = new SequentialTransition(animationUp, animationDown);
                            move.play();

                        } else {
                            down = 1500;
                            animationDown = new Timeline(

                                    new KeyFrame(Duration.millis(down),

                                            new KeyValue(circle.layoutYProperty(), 600))
                            );

                            move = new SequentialTransition(animationUp, animationDown);
                            move.play();
                        }

                    }



            });

        return 0;
    }














}