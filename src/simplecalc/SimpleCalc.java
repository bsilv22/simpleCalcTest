/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Brett
 */
public class SimpleCalc extends Application {
    public static void main(String[] args){
    launch(args);
    
    System.out.print("Testing");
            
    }
    
    @Override
    public void start(Stage stage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("LayoutGUI.fxml"));
    stage.setScene(new Scene(root));
    stage.show();
    
    }
   
    
}
