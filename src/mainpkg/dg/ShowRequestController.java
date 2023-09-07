/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg.dg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;




public class ShowRequestController implements Initializable {

    @FXML
    private TableView<Request> pendingRequestTableViewFxid;
    @FXML
    private TableColumn<Request, Integer> pendingRequestIdColomnFxid;
    @FXML
    private TableColumn<Request, String> pendingRequestTypeColomnFxid;
    @FXML
    private TableColumn<Request, String> pendingRequestSenderColomnFxid;
    @FXML
    private TableColumn<Request, String> pendingRequestDescriptionColomnFxid;
    @FXML
    private TableView<Request> requestHistoryTableViewFxid;
    @FXML
    private TableColumn<Request, Integer> requestHistoryIDColumnFxid;
    @FXML
    private TableColumn<Request, String> requestHistorySenderColumnFxid;
    @FXML
    private TableColumn<Request, Boolean> requestHistoryStatusColumnFxid;
    @FXML
    private TableColumn<Request, LocalDate> pendingRequestTimeColomnFxid;
    @FXML
    private TextArea messageContentTextArea;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

        pendingRequestIdColomnFxid.setCellValueFactory(new PropertyValueFactory<>("requestID"));
        pendingRequestTypeColomnFxid.setCellValueFactory(new PropertyValueFactory<>("requestType"));
        pendingRequestSenderColomnFxid.setCellValueFactory(new PropertyValueFactory<>("requestSender"));
        pendingRequestDescriptionColomnFxid.setCellValueFactory(new PropertyValueFactory<>("requestDescription"));
        pendingRequestTimeColomnFxid.setCellValueFactory(new PropertyValueFactory<>("requestTime"));
        DG.showRequests();
        
        requestHistoryIDColumnFxid.setCellValueFactory(cellData -> 
            new SimpleObjectProperty<>(cellData.getValue().getRequestID()));
        requestHistorySenderColumnFxid.setCellValueFactory(cellData -> 
            new SimpleObjectProperty<>(cellData.getValue().getRequestSender()));
        requestHistoryStatusColumnFxid.setCellValueFactory(cellData -> 
            new SimpleObjectProperty<>(cellData.getValue().getRequestStatus()));
        
        
        pendingRequestTableViewFxid.setItems(DG.showRequests()); 
        
          pendingRequestTableViewFxid.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
          
        
        pendingRequestTableViewFxid.setRowFactory(tv -> {
            TableRow<Request> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getClickCount() == 2) {
                    // Process rowData
                }
            });
            return row;
        });
   

        
        
    }    

    @FXML
    private void approveButtonOnClick(ActionEvent event) {
 ObservableList<Request> selectedRows = pendingRequestTableViewFxid.getSelectionModel().getSelectedItems();
        for (Request selectedRow : selectedRows) {
            DG.approvedRequest(selectedRow);
            selectedRow.setRequestStatus(Boolean.TRUE);
            requestHistoryTableViewFxid.setItems(selectedRows);
            
            


            
 }
    }

    @FXML
    private void declineButtonOnClick(ActionEvent event) {
      ObservableList<Request> selectedRows = pendingRequestTableViewFxid.getSelectionModel().getSelectedItems();
        for (Request selectedRow : selectedRows) {
            DG.declinedRequest(selectedRow);
            selectedRow.setRequestStatus(Boolean.FALSE);
            requestHistoryTableViewFxid.setItems(selectedRows);   
        }    
        
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
