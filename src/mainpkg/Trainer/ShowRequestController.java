/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg.Trainer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ShowRequestController implements Initializable {

    @FXML
    private TableView<?> pendingRequestTableViewFxid;
    @FXML
    private TableColumn<?, ?> pendingRequestIdColomnFxid;
    @FXML
    private TableColumn<?, ?> pendingRequestTypeColomnFxid;
    @FXML
    private TableColumn<?, ?> pendingRequestSenderColomnFxid;
    @FXML
    private TableColumn<?, ?> pendingRequestTimeColomnFxid;
    @FXML
    private TableColumn<?, ?> pendingRequestDescriptionColomnFxid;
    @FXML
    private TableView<?> requestHistoryTableViewFxid;
    @FXML
    private TableColumn<?, ?> requestHistoryIDColumnFxid;
    @FXML
    private TableColumn<?, ?> requestHistorySenderColumnFxid;
    @FXML
    private TableColumn<?, ?> requestHistoryStatusColumnFxid;
    @FXML
    private TextArea messageContentTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void approveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void declineButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void generatePDFButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewDetailsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void pdfGenerateButtonOnClick(ActionEvent event) {
    }
    
}
