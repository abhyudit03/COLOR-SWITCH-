
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class helpController {


    @FXML
    private Button backbutton;

    @FXML
    public void back(MouseEvent event) {
        Stage stage=(Stage) backbutton.getScene().getWindow();
        stage.close();
    }
}


