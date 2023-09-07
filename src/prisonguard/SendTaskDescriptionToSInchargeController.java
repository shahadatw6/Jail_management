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
import javafx.scene.input.MouseEvent;
import securityincharge.AssignedTasks;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class SendTaskDescriptionToSInchargeController implements Initializable {

    @FXML
    private TextArea descriptionTextArea;
    
    private AssignedTasks at;
    public void data(AssignedTasks at) {
        this.at = at;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendDescriptionOnClick(MouseEvent event) {
        String description = descriptionTextArea.getText();
        at.setTaskCompletionDescription(description);
        PrisonGuard.sendUpdates(at);
    }
    
}
