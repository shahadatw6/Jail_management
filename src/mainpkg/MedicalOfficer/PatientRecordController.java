/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg.MedicalOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import jailor.Prisoner;

/**
 * FXML Controller class
 *
 * @author crypticx
 */
public class PatientRecordController implements Initializable {

    @FXML
    private TableView<Prisoner> patientTable;
    @FXML
    private TableColumn<Prisoner, Integer> prisonerIDColumn;
    @FXML
    private TableColumn<Prisoner, String> patientNameCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        prisonerIDColumn.setCellValueFactory(new PropertyValueFactory<>("prisoner_id"));
        patientNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        // TODO
    }    

    @FXML
    private void prescibeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void historyButtonOnClick(ActionEvent event) {
    }
    
}
