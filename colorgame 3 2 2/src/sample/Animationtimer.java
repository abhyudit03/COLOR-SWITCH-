package sample;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Animationtimer extends AnimationTimer {
    public  static Label lable;

    private  int random;

    private obstacle arr[];
    private Ball ball;

    private AnchorPane pane;

    //private gameplay gp;

    public Animationtimer(obstacle[] arr,Ball ball,AnchorPane pane,int random,Label lable){
        this.arr  = arr;
        this.ball = ball;
        this.pane = pane;
        this.random=random;
        this.lable = lable;

    }

    boolean flagA=true,flagB=true,flagC=true,flagD=true,flagE=true,flagF=true;
    boolean flagAA=true,flagBB=true,flagCC=true,flagDD=true,flagEE=true,flagFF=true;
    boolean flagG=true,flagH=true,flagI=true,flagJ=true,flagK=true,flagL=true;
    boolean flagGG=true,flagHH=true,flagII=true,flagJJ=true,flagKK=true,flagLL=true;
    boolean flagM=true,flagN=true,flagO=true,flagP=true,flagQ=true,flagR=true;
    boolean flagMM=true,flagNN=true,flagOO=true,flagPP=true,flagQQ=true,flagRR=true;
    public static int Global=0;


    @Override
    public void handle(long handle){
        try {
            obstacle1 ob1 = (obstacle1) arr[0];
            obstacle2 ob2 = (obstacle2) arr[1];
            obstacle3 ob3 = (obstacle3) arr[2];
            obstacle4 ob4 = (obstacle4) arr[3];
            obstacle5 ob5 = (obstacle5) arr[4];
            obstacle6 ob6 = (obstacle6) arr[5];

            obstacle1 ob7 = (obstacle1) arr[6];
            obstacle2 ob8 = (obstacle2) arr[7];
            obstacle3 ob9 = (obstacle3) arr[8];
            obstacle4 ob10 = (obstacle4) arr[9];
            obstacle5 ob11 = (obstacle5) arr[10];
            obstacle6 ob12 = (obstacle6) arr[11];

            obstacle1 ob13 = (obstacle1) arr[12];
            obstacle2 ob14 = (obstacle2) arr[13];
            obstacle3 ob15 = (obstacle3) arr[14];
            obstacle4 ob16 = (obstacle4) arr[15];
            obstacle5 ob17 = (obstacle5) arr[16];
            obstacle6 ob18 = (obstacle6) arr[17];

            if (ball.getcircle().localToScene(0, 0).getY() >= 599) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob1.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();

            }
            if (ob3.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob2.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }

            if (ob4.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob5.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob6.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }

            if (ob7.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob8.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob9.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }

            if (ob10.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob11.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob12.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
//
            if (ob13.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob14.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob15.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob16.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob17.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }
            if (ob18.collisionDetection(ball) == 1) {
                System.out.println("gameOver");
                this.stop();
                Pane root = null;
                try {
                    gameplay.timer.stop();
                    Ball.move.stop();
                    root = FXMLLoader.load(getClass().getResource("collision.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();

                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle("Pause Screen");
                // this will not allow user to interact with MainPage when Game Screen screen is open
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.DECORATED);
                stage.show();
            }

            //boolean flag=true;
            int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0;


            if (flagA) {
                a = ob1.getColorSwitcher().collisionDetection(ball);
            }
            if (flagB) {
                b = ob2.getColorSwitcher().collisionDetection(ball);
            }
            if (flagC) {
                c = ob3.getColorSwitcher().collisionDetection(ball);
            }
            if (flagD) {
                d = ob4.getColorSwitcher().collisionDetection(ball);
            }
            if (flagE) {
                e = ob5.getColorSwitcher().collisionDetection(ball);
            }
            if (flagF) {
                f = ob6.getColorSwitcher().collisionDetection(ball);
            }

            if (flagG) {
                g = ob7.getColorSwitcher().collisionDetection(ball);
            }
            if (flagH) {
                h = ob8.getColorSwitcher().collisionDetection(ball);
            }
            if (flagI) {
                i = ob9.getColorSwitcher().collisionDetection(ball);
            }
            if (flagJ) {
                j = ob10.getColorSwitcher().collisionDetection(ball);
            }
            if (flagK) {
                k = ob11.getColorSwitcher().collisionDetection(ball);
            }
            if (flagL) {
                l = ob12.getColorSwitcher().collisionDetection(ball);
            }


            if (flagM) {
                m = ob13.getColorSwitcher().collisionDetection(ball);
            }
            if (flagN) {
                n = ob14.getColorSwitcher().collisionDetection(ball);
            }
            if (flagO) {
                o = ob15.getColorSwitcher().collisionDetection(ball);
            }
            if (flagP) {
                p = ob16.getColorSwitcher().collisionDetection(ball);
            }
            if (flagQ) {
                q = ob17.getColorSwitcher().collisionDetection(ball);
            }
            if (flagR) {
                r = ob18.getColorSwitcher().collisionDetection(ball);
            }


            if (ob1.getLayoutY() > 700) {
                flagA = true;
                ob1.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob1.getColorSwitcher().getArc1().setFill(Color.RED);
                ob1.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob1.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob2.getLayoutY() > 700) {
                flagB = true;
                ob2.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob2.getColorSwitcher().getArc1().setFill(Color.RED);
                ob2.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob2.getColorSwitcher().getArc3().setFill(Color.YELLOW);

            }
            if (ob3.getLayoutY() > 700) {
                flagC = true;
                ob3.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob3.getColorSwitcher().getArc1().setFill(Color.RED);
                ob3.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob3.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob4.getLayoutY() > 700) {
                flagD = true;
                ob4.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob4.getColorSwitcher().getArc1().setFill(Color.RED);
                ob4.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob4.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob5.getLayoutY() > 700) {
                flagE = true;
                ob5.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob5.getColorSwitcher().getArc1().setFill(Color.RED);
                ob5.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob5.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob6.getLayoutY() > 700) {
                flagF = true;
                ob6.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob6.getColorSwitcher().getArc1().setFill(Color.RED);
                ob6.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob6.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }

            if (ob7.getLayoutY() > 700) {
                flagG = true;
                ob7.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob7.getColorSwitcher().getArc1().setFill(Color.RED);
                ob7.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob7.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob8.getLayoutY() > 700) {
                flagH = true;
                ob8.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob8.getColorSwitcher().getArc1().setFill(Color.RED);
                ob8.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob8.getColorSwitcher().getArc3().setFill(Color.YELLOW);

            }
            if (ob9.getLayoutY() > 700) {
                flagI = true;
                ob9.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob9.getColorSwitcher().getArc1().setFill(Color.RED);
                ob9.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob9.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob10.getLayoutY() > 700) {
                flagJ = true;
                ob10.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob10.getColorSwitcher().getArc1().setFill(Color.RED);
                ob10.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob10.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob11.getLayoutY() > 700) {
                flagK = true;
                ob11.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob11.getColorSwitcher().getArc1().setFill(Color.RED);
                ob11.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob11.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob12.getLayoutY() > 700) {
                flagL = true;
                ob12.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob12.getColorSwitcher().getArc1().setFill(Color.RED);
                ob12.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob12.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }

            if (ob13.getLayoutY() > 700) {
                flagM = true;
                ob13.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob13.getColorSwitcher().getArc1().setFill(Color.RED);
                ob13.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob13.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob14.getLayoutY() > 700) {
                flagN = true;
                ob14.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob14.getColorSwitcher().getArc1().setFill(Color.RED);
                ob14.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob14.getColorSwitcher().getArc3().setFill(Color.YELLOW);

            }
            if (ob15.getLayoutY() > 700) {
                flagO = true;
                ob15.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob15.getColorSwitcher().getArc1().setFill(Color.RED);
                ob15.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob15.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob16.getLayoutY() > 700) {
                flagP = true;
                ob16.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob16.getColorSwitcher().getArc1().setFill(Color.RED);
                ob16.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob16.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob17.getLayoutY() > 700) {
                flagQ = true;
                ob17.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob17.getColorSwitcher().getArc1().setFill(Color.RED);
                ob17.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob17.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }
            if (ob18.getLayoutY() > 700) {
                flagR = true;
                ob18.getColorSwitcher().getArc().setFill(Color.CYAN);
                ob18.getColorSwitcher().getArc1().setFill(Color.RED);
                ob18.getColorSwitcher().getArc2().setFill(Color.PURPLE);
                ob18.getColorSwitcher().getArc3().setFill(Color.YELLOW);
            }


            if (a == 1) {
                ob1.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob1.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob1.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob1.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagA = false;
            } else if (b == 1) {
                ob2.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob2.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob2.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob2.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagB = false;
            } else if (c == 1) {
                ob3.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob3.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob3.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob3.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagC = false;
            } else if (d == 1) {
                ob4.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob4.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob4.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob4.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagD = false;
            } else if (e == 1) {
                ob5.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob5.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob5.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob5.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagE = false;
            } else if (f == 1) {
                ob6.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob6.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob6.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob6.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagF = false;
            }

            if (g == 1) {
                ob7.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob7.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob7.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob7.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagG = false;
            } else if (h == 1) {
                ob8.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob8.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob8.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob8.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagH = false;
            } else if (i == 1) {
                ob9.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob9.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob9.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob9.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagI = false;
            } else if (j == 1) {
                ob10.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob10.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob10.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob10.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagJ = false;
            } else if (k == 1) {
                ob11.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob11.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob11.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob11.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagK = false;
            } else if (l == 1) {
                ob12.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob12.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob12.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob12.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagL = false;
            }


            if (m == 1) {
                ob13.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob13.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob13.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob13.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagM = false;
            } else if (n == 1) {
                ob14.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob14.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob14.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob14.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagN = false;
            } else if (o == 1) {
                ob15.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob15.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob15.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob15.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagO = false;
            } else if (p == 1) {
                ob16.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob16.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob16.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob16.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagP = false;
            } else if (q == 1) {
                ob17.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob17.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob17.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob17.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagQ = false;
            } else if (r == 1) {
                ob18.getColorSwitcher().getArc().setFill(Color.TRANSPARENT);
                ob18.getColorSwitcher().getArc1().setFill(Color.TRANSPARENT);
                ob18.getColorSwitcher().getArc2().setFill(Color.TRANSPARENT);
                ob18.getColorSwitcher().getArc3().setFill(Color.TRANSPARENT);
                flagR = false;
            }


            int aa = 0, bb = 0, cc = 0, dd = 0, ee = 0, ff = 0, gg = 0, hh = 0, ii = 0, jj = 0, kk = 0, ll = 0, mm = 0, nn = 0, oo = 0, pp = 0, qq = 0, rr = 0;


            if (flagAA) {
                aa = ob1.getStar().collisionDetection(ball);
            }
            if (flagBB) {
                bb = ob2.getStar().collisionDetection(ball);
            }
            if (flagCC) {
                cc = ob3.getStar().collisionDetection(ball);
            }
            if (flagDD) {
                dd = ob4.getStar().collisionDetection(ball);
            }
            if (flagEE) {
                ee = ob5.getStar().collisionDetection(ball);
            }
            if (flagFF) {
                ff = ob6.getStar().collisionDetection(ball);
            }


            if (flagGG) {
                gg = ob7.getStar().collisionDetection(ball);
            }
            if (flagHH) {
                hh = ob8.getStar().collisionDetection(ball);
            }
            if (flagII) {
                ii = ob9.getStar().collisionDetection(ball);
            }
            if (flagJJ) {
                jj = ob10.getStar().collisionDetection(ball);
            }
            if (flagKK) {
                kk = ob11.getStar().collisionDetection(ball);
            }
            if (flagLL) {
                ll = ob12.getStar().collisionDetection(ball);
            }


            if (flagMM) {
                mm = ob13.getStar().collisionDetection(ball);
            }
            if (flagNN) {
                nn = ob14.getStar().collisionDetection(ball);
            }
            if (flagOO) {
                oo = ob15.getStar().collisionDetection(ball);
            }
            if (flagPP) {
                pp = ob16.getStar().collisionDetection(ball);
            }
            if (flagQQ) {
                qq = ob17.getStar().collisionDetection(ball);
            }
            if (flagRR) {
                rr = ob18.getStar().collisionDetection(ball);
            }

            if (ob1.getLayoutY() > 700) {
                flagAA = true;
                ob1.getStar().getPolygon1().setFill(Color.WHITESMOKE);
                ob1.getStar().getPolygon2().setFill(Color.WHITESMOKE);

            }
            if (ob2.getLayoutY() > 700) {
                flagBB = true;
                ob2.getStar().getPolygon1().setFill(Color.WHITESMOKE);
                ob2.getStar().getPolygon2().setFill(Color.WHITESMOKE);
            }
            if (ob3.getLayoutY() > 700) {
                flagCC = true;
                ob3.getStar().getPolygon1().setFill(Color.WHITESMOKE);
                ob3.getStar().getPolygon2().setFill(Color.WHITESMOKE);
            }
            if (ob4.getLayoutY() > 700) {
                flagDD = true;
                ob4.getStar().getPolygon1().setFill(Color.WHITESMOKE);
                ob4.getStar().getPolygon2().setFill(Color.WHITESMOKE);
            }
            if (ob5.getLayoutY() > 700) {
                flagEE = true;
                ob5.getStar().getPolygon1().setFill(Color.WHITESMOKE);
                ob5.getStar().getPolygon2().setFill(Color.WHITESMOKE);
            }
            if (ob6.getLayoutY() > 700) {
                flagFF = true;
                ob6.getStar().getPolygon1().setFill(Color.WHITESMOKE);
                ob6.getStar().getPolygon2().setFill(Color.WHITESMOKE);
            }

            if (aa == 1) {
                ob1.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob1.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagAA = false;
            } else if (bb == 1) {
                ob2.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob2.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagBB = false;
            } else if (cc == 1) {
                ob3.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob3.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagCC = false;
            } else if (dd == 1) {
                ob4.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob4.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagDD = false;
            } else if (ee == 1) {
                ob5.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob5.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagEE = false;
            } else if (ff == 1) {
                ob6.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob6.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));


                flagFF = false;
            }

            if (gg == 1) {
                ob7.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob7.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagGG = false;
            } else if (hh == 1) {
                ob8.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob8.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagHH = false;
            } else if (ii == 1) {
                ob9.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob9.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagII = false;
            } else if (jj == 1) {
                ob10.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob10.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagJJ = false;
            } else if (kk == 1) {
                ob11.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob11.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagKK = false;
            } else if (ll == 1) {
                ob12.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob12.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));


                flagLL = false;
            }

            if (mm == 1) {
                ob13.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob13.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagMM = false;
            } else if (nn == 1) {
                ob14.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob14.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagNN = false;
            } else if (oo == 1) {
                ob15.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob15.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagOO = false;
            } else if (pp == 1) {
                ob16.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob16.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagPP = false;
            } else if (qq == 1) {
                ob17.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob17.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));
                flagQQ = false;
            } else if (rr == 1) {
                ob18.getStar().getPolygon1().setFill(Color.TRANSPARENT);
                ob18.getStar().getPolygon2().setFill(Color.TRANSPARENT);
                Global++;
                lable.setText((Integer.toString(Animationtimer.Global)));


                flagRR = false;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
