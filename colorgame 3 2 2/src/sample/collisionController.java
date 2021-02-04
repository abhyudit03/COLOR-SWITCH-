package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class collisionController {



    @FXML
    private Button restart;

    @FXML
    private Label label;

    @FXML
    private Button resurrect;

    @FXML
    private void initialize(){
        label.setText(Integer.toString(Animationtimer.Global));
    }

    @FXML
    public void okayfunc(MouseEvent event){
        System.exit(0);

    }

    @FXML
    public void restartfunc(MouseEvent event){


        Stage stage=(Stage) restart.getScene().getWindow();
        stage.close();
        mainpageController.stage.close();


    }

    @FXML
    public void resume(MouseEvent event){

        if( Animationtimer.Global>=2 ){
            Animationtimer.Global-=2;
            Animationtimer.lable.setText((Integer.toString(Animationtimer.Global)));
            Stage stage=(Stage) resurrect.getScene().getWindow();
            stage.close();


            Ball.move.play();
            System.out.println(Ball.getcircle().getLayoutY());
            Ball.getcircle().setLayoutY(Ball.getcircle().getLayoutY()-100);

            gameplay.timer.start();

        }
        else{

            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText(" *****You don't have Enough Stars***** ");
            a.show();

        }
    }
}
