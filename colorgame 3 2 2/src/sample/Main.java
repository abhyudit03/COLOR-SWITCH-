package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;


public class Main extends Application {
    static MediaPlayer mediaPlayer;
    private static database currentd;
    public static Stage primaryStage;
    private void setPrimaryStage(Stage stage) {
        Main.primaryStage = stage;
    }

    static public Stage getPrimaryStage() {
        return Main.primaryStage;
    }
    public static database getDatabase(){
        return currentd;
    }
    public static void serialize() throws IOException {
        ObjectOutputStream out=null;
        try {
            out = new ObjectOutputStream (new FileOutputStream("data_rakha_hai_humne.txt"));
            out.writeObject(currentd);
        }
        finally {
            out.close();
            System.exit(0);
        }
    }
    public static void desealize() throws ClassNotFoundException, FileNotFoundException, IOException{
        ObjectInputStream in = null;
        try {
            in=new ObjectInputStream (new FileInputStream("data_rakha_hai_humne.txt"));
            currentd=(database) in.readObject();
        }
        catch (FileNotFoundException e){
            currentd=new database();
            System.out.println("Erorr hai kholne mai baki hum dekhte hai kya karna hai");
        }
        catch (IOException e) {
            currentd=new database();
        }
    }
    public static void callDesirializable() throws IOException, ClassNotFoundException {
        desealize();
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        tunes();
        Parent root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        setPrimaryStage(primaryStage);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Color Switch");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }

    public void tunes(){


        try {
            String dir = System.getProperty("user.dir");

            //System.out.println(dir);

            String music = dir + "/src/sample/Background.mp3";

            Media sound = new Media(new File(music).toURI().toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            mediaPlayer.play();
        }
        catch (Exception e){
            System.out.println("Media player not found");
        }

    }
    public static void main(String[] args) {
        launch(args);
    }
}
