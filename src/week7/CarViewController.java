/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hello
 */
public class CarViewController implements Initializable {

    @FXML private TextField makeTextField;
    @FXML private TextField modelTextField;
    @FXML private TextField yearTextField;
    @FXML private TextField mileageTextField;
    @FXML private TextField sellPriceTextField;
    @FXML private TextField FeaturesTextField;
    
    @FXML private Button generateCarButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }   
    
    public void generateCarButtonPushed()
        {
            Car viewCar = new Car(makeTextField.getText(), modelTextField.getText(),yearTextField.getValue(),mileageTextField.getValue(), sellPriceTextField.getText(),FeaturesTextField.getText()  );
        }
    
}
