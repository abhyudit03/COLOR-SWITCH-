package sample;


import javafx.scene.Group;
import javafx.scene.shape.Shape;

public abstract class obstacle extends Group {
    private double position_y = -300.0;


    public double getPosition_y() {
        return position_y;
    }


    public void setPosition_y(int position_y){
        this.position_y=position_y;
    }

    public abstract void intersect1(Ball ball, Shape[] shapes);

    public abstract void intersect2(Ball ball, Shape[] shapes);

    public abstract void move();

    public abstract int collisionDetection(Ball ball);

    public abstract double checkpos();

    public abstract void newpos();
}
