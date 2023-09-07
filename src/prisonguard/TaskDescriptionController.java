/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prisonguard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import securityincharge.AssignedTasks;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class TaskDescriptionController implements Initializable {
    private AssignedTasks at;
    

    @FXML
    private TextArea showDescriptionTextArea;

    /**
     * Initializes the controller class.
     */
    
    public void data(AssignedTasks at) {
        this.at = at;
        showDescriptionTextArea.setText(at.getT().getDescription());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
