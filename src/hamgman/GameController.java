/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hamgman;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hamid Raza
 */
public class GameController implements Initializable {

    @FXML
    private TextField guessfield;
    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private ImageView image7;
    @FXML
    private Label livesCounter;

    public static int life = 5; 
    Random r = new Random();
    public static String [] array = {"public", "private", "default", "protected"};
    String word = array[r.nextInt(array.length)];
    
    @FXML
    private void handleCheckAction(ActionEvent event){
        String input = guessfield.getText();
        {
            if(input.equals(word)){
                livesCounter.setText("You win!");
                image1.setVisible(false);
                image2.setVisible(false);
                image3.setVisible(false);
                image4.setVisible(false);
                image5.setVisible(false);
                image6.setVisible(true);
                image7.setVisible(false);
            } else {
                life --;
                livesCounter.setText(life + " lives left!");
                image1.setVisible(false);
                image2.setVisible(true);
                image3.setVisible(false);
                image4.setVisible(false);
                image5.setVisible(false);
                image6.setVisible(false);
                image7.setVisible(false);
                if(life == 3){
                    livesCounter.setText(life + " lives left!");
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(true);
                    image4.setVisible(false);
                    image5.setVisible(false);
                    image6.setVisible(false);
                    image7.setVisible(false);
                }
                if(life == 2){
                    livesCounter.setText(life + " lives left!");
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(true);
                    image5.setVisible(false);
                    image6.setVisible(false);
                    image7.setVisible(false);
                }
                if(life == 1){
                    livesCounter.setText(life + " lives left!");
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(false);
                    image5.setVisible(true);
                    image6.setVisible(false);
                    image7.setVisible(false);
                }
                if(life == 0){
                    livesCounter.setText("You lose!");
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(false);
                    image5.setVisible(false);
                    image6.setVisible(false);
                    image7.setVisible(true);
                }              
            }       
        }
    }
    
    @FXML
    private void handleBackAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage2 = new Stage();
        Scene scene = new Scene(root);
        stage2.setTitle("HANGMAN GAME");
        stage2.setScene(scene);
        stage2.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        image1.setVisible(true);
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);
        image7.setVisible(false);
        
    }    
    
}
