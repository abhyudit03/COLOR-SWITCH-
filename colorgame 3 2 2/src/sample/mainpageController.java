package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class mainpageController implements Initializable {
    private FXMLLoader fxmlLoader ;
     static AnchorPane pane;
    @FXML
    private Button Play;
    @FXML
    private AnchorPane mainRoot;
    @FXML
    private Arc arc;
    @FXML
    private Arc arc1;
    @FXML
    private Arc arc2;
    @FXML
    private Arc arc3;
    @FXML
    private Arc arc4;
    @FXML
    private Arc arc5;
    @FXML
    private Arc arc6;
    @FXML
    private Arc arc7;

    private Paint ballColor;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        animate(arc);
        animate(arc1);
        animate(arc2);
        animate(arc3);
        animate(arc4);
        animate(arc5);
        animate(arc6);
        animate(arc7);
        Circle circle1 = new Circle(203.0, 53.0, 18.0, Color.BLACK);
        Circle circle2 = new Circle(291.0, 53.0, 18.0, Color.BLACK);
        obstaclehomepage obh=new obstaclehomepage(mainRoot);
        ballColor= Color.WHITE;
        ballHomePage ball=new ballHomePage(ballColor,260);
        ballColor=Color.WHITESMOKE;
        ballHomePage ball2=new ballHomePage(ballColor,273);
        ballColor= Color.LIGHTGRAY;
        ballHomePage ball3=new ballHomePage(ballColor,286);

        mainRoot.getChildren().addAll(ball.circle,ball2.circle,ball3.circle,circle1,circle2);
    }

    @FXML
    void exitGame(ActionEvent event) {

        System.exit(0);
    }
    public static void vish(gameplay gameplay,Stage stage){




        Scene scene = new Scene(pane);

        gameplay.startgame(pane,scene);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
    static Stage stage;
    @FXML
    private void playgame(ActionEvent event) throws Exception {
        //FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("gameplay.fxml"));
        //AnchorPane pane=fxmlLoader.load();
        //mainRoot.getChildren().setAll(pane);

        Animationtimer.Global=0;
         stage=new Stage();
        fxmlLoader= new FXMLLoader(getClass().getResource("gameplay.fxml"));
        pane  = fxmlLoader.load();
        gameplay gameplay=fxmlLoader.getController();
        gameplay.start(stage);







    }
    @FXML
    private void gethelp(ActionEvent event) throws IOException{

        Stage stage=new Stage();
        AnchorPane pane=FXMLLoader.load(getClass().getResource("help.fxml"));
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();


    }

    @FXML
    private void showSavedgames(ActionEvent event) throws IOException{
        Stage stage=new Stage();
        AnchorPane pane=FXMLLoader.load(getClass().getResource("saved_game.fxml"));
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }


    public void animate(Arc arc){
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(3), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() +360, Interpolator.LINEAR))

        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }



}