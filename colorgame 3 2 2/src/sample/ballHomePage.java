package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class ballHomePage {

    private int positionY;
    private Paint color;
    private int  positionX=244;
    private int radius =15;
    Circle circle=new Circle();



    public ballHomePage(Paint color, int positionY){

        this.positionY=positionY;
        this.color=color;

        circle.setCenterX(positionX);
        circle.setCenterY(positionY);
        circle.setRadius(radius);
        circle.setFill(color);

    }

    public void setColor( Paint color){
        this.color=color;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Paint getColor() {
        return color;
    }

    public int getPositionY() {
        return positionY;
    }

}
