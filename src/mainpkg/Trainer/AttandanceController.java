/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg.Trainer;

import jailor.Prisoner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AttandanceController implements Initializable {

    @FXML
    private TableView<CustomClassToShowCourseAndPrisoner> attandanceTableViewFxid;
    @FXML
    private TableColumn<Prisoner, Integer> prisonerIdTableColomnFxid;
    @FXML
    private TableColumn<Prisoner, String> prisonerNameTableColomnFxid;
    @FXML
    private TableColumn<TrainingProgramCourses, String> courseNameTableColomnFxid;
    @FXML
    private TableColumn<?, ?> presentTableColomnFxid;
    @FXML
    private TableColumn<?, ?> absentTableColomnFxid;
    @FXML
    private Label statusLabelForAttandance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    }    
    
}
