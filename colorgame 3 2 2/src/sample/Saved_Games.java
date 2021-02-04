package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Saved_Games {
    @FXML
    private Button button;

    @FXML
    public  ListView listView;

    static int abhstar=3;
    static int vikstar=1;
    static  int Gueststar=0;
    static ObservableList<String> items;
    @FXML
    public void initialize(){
         items = FXCollections.observableArrayList (
                 "Abhyudit","Vikhyat","Guest");
        listView.setItems(items);


    }
    @FXML
    public void abcd(MouseEvent event) {
        Stage stage=(Stage) button.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleMouseClick(MouseEvent event) throws Exception {
        if(listView.getSelectionModel().getSelectedItem()=="Abhyudit"){
            //System.out.println("abh");
            Animationtimer.Global=abhstar;
            mainpageController.stage=new Stage();
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("gameplay.fxml"));
            mainpageController.pane  = fxmlLoader.load();
            gameplay gameplay=fxmlLoader.getController();
            gameplay.start(mainpageController.stage);


        }
        if(listView.getSelectionModel().getSelectedItem()=="Vikhyat"){
            //System.out.println("vik");
            Animationtimer.Global=vikstar;
             mainpageController.stage=new Stage();
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("gameplay.fxml"));
            mainpageController.pane  = fxmlLoader.load();
            gameplay gameplay=fxmlLoader.getController();
            gameplay.start(mainpageController.stage);


        }
        if(listView.getSelectionModel().getSelectedItem()=="Guest"){
            //System.out.println("vik");
            Animationtimer.Global=Gueststar;
            mainpageController.stage=new Stage();
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("gameplay.fxml"));
            mainpageController.pane  = fxmlLoader.load();
            gameplay gameplay=fxmlLoader.getController();
            gameplay.start(mainpageController.stage);


        }


    }





}



