package src;

import java.util.LinkedList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/* 
 * Furkan Sarihan 
 * fusarihan@gmail.com
 * 
 */

public class Nizam extends Application{

    /* Defines */
    public int TAX = 800; // Text area width
    public int TAY = 680; // Text area heigth
    /* Defines */

    /* Varibles */
    public float fontHeigth;
    public float fontWidth;
    /* Varibles */
    
    /* Objects */
    public Scene scene;
    public AnchorPane root;
    /* Objects */

    @Override 
    public void start(Stage s){
        try{
            initilaize(s); // Initial
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void initilaize(Stage stage) throws Exception{
        stage.setTitle("Nizam");
        stage.setWidth(TAX);
        stage.setHeight(TAY);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NizamLayout.fxml"));
        root = loader.load();
        CanvasController nc = loader.getController();
        System.out.println(nc);
        System.out.println(this);
        scene = new Scene(root);
        nc.setObjects(scene);
        stage.setScene(scene);
        stage.show();
        nc.focus();
    }
    
/******************************************************************************/
        public static void main(String[] args) {
            Application.launch(args);
        }
}