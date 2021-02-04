package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class gameplay  extends Application  {



    static AnimationTimer timer;
    static boolean run=true;

    static obstacle arr [] = new obstacle[18];
    public Ball ball;
    private Paint ballColor;


    private  AnchorPane pane;
    public void setArr(obstacle[] arr) {
        this.arr = arr;
    }

    public obstacle[] getArr() {
        return arr;
    }
    @FXML
    private  Label lable;

    @FXML
    private ToggleButton music;

    @FXML
    private void playmusic(MouseEvent event){
        if(music.isSelected())
        {
            Main.mediaPlayer.stop();
        }
        else {
            Main.mediaPlayer.play();
        }
    }

    @FXML
    private void initialize() {
        lable.setText((Integer.toString(Animationtimer.Global)));
        System.out.println(lable.getText());
    }
    @FXML
    private void pauseGame(MouseEvent event) throws Exception{
        Stage stage=new Stage();
        timer.stop();
        Ball.move.stop();
        pane= FXMLLoader.load(getClass().getResource("pause.fxml"));
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        obstaclehomepage obstaclehomepage=new obstaclehomepage(pane);
        ballHomePage ballHomePage=new ballHomePage(Color.WHITESMOKE,275);
        pane.getChildren().add(ballHomePage.circle);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
        mainpageController.vish(this,stage);

    }


    public void saveGame(){
        try{
            Main.serialize();
        }
        catch (IOException e){
            System.out.println("Input galat hai ");
        }
    }


    public void startgame(AnchorPane pane,Scene scene){
        ballColor=Color.CYAN;

        ball=new Ball(ballColor,455,scene);


        pane.getChildren().addAll(ball.getcircle());
        obstacle1 ob1 = new obstacle1(pane,ballColor,3.7);
        obstacle2 ob2 = new obstacle2(pane,ballColor,3.2);
        obstacle3 ob3 = new obstacle3(pane,ballColor,4.5);
        obstacle4 ob4 = new obstacle4(pane,ballColor,3.32);
        obstacle5 ob5 = new obstacle5(pane,ballColor,4);
        obstacle6 ob6 = new obstacle6(pane,ballColor,3.1);
        arr[0] = ob1;
        arr[1] = ob2;
        arr[2] = ob3;
        arr[3] = ob4;
        arr[4] = ob5;
        arr[5] = ob6;

                                                                                                                                                                                                    obstacle1 ob11 = new obstacle1(pane,ballColor,3.75);
                                                                                                                                                                                                        obstacle1 ob111 = new obstacle1(pane,ballColor,3.9);
                                                                                                                                                                                                    arr[6]=ob11;
                                                                                                                                                                                                          arr[12] = ob111;
                                                                                                                                                                                                                                                obstacle2 ob22 = new obstacle2(pane,ballColor,3);
                                                                                                                                                                                                                                                obstacle2 ob222 = new obstacle2(pane,ballColor,4.25);
                                                                                                                                                                                                                                                obstacle3 ob33 = new obstacle3(pane,ballColor,4.5);
                                                                                                                                                                                                                                                obstacle3 ob333 = new obstacle3(pane,ballColor,3.8);
                                                                                                                                                                                                                                                obstacle4 ob44 = new obstacle4(pane,ballColor,3.25);
                                                                                                                                                                                                                                                obstacle4 ob444 = new obstacle4(pane,ballColor,3.99);
                                                                                                                                                                                                                                                obstacle5 ob55 = new obstacle5(pane,ballColor,4.3);
                                                                                                                                                                                                                                                obstacle5 ob555 = new obstacle5(pane,ballColor,3.34);
                                                                                                                                                                                                                                                obstacle6 ob66 = new obstacle6(pane,ballColor,4.1);
                                                                                                                                                                                                                                                obstacle6 ob666 = new obstacle6(pane,ballColor,4.12);
                                                                                                                                                                                              arr[7] = ob22;
                                                                                                                                                                                            arr[13] = ob222;

                                                                                                                                                                                                        arr[8] = ob33;
                                                                                                                                                                                             arr[14] = ob333;
                                                                                                                                                                                          arr[9] = ob44;
                                                                                                                                                                                             arr[15] = ob444;
                                                                                                                                                                                            arr[10] = ob55;
                                                                                                                                                                                            arr[16] = ob555;
                                                                                                                                                                                            arr[11] = ob66;
                                                                                                                                                                                            arr[17] = ob666;
        System.out.println(lable.getText());
        //moveball
        int random = ball.moveball(ball, arr);

        timer = new Animationtimer(arr, ball, pane, random,lable);
        timer.start();





        //obstacle1 ob1=new obstacle1(pane);
        //ball.setColor(ballColor);
        //obstacle2 ob2=new obstacle2(pane);
        //obstacle3 ob3=new obstacle3(pane);
        //obstacle4 ob4=new obstacle4(pane);
        //obstacle5 ob5=new obstacle5(pane);
//        obstacle6 ob6=new obstacle6(pane);
//        System.out.println("zz");

        //pane.getChildren().addAll(ball.circle);

    }
    public Ball getBall(){
        return this.ball;
    }


}