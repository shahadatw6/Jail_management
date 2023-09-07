
package prisonguard;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import securityincharge.AssignedTasks;
import securityincharge.SecurityInCharge;
import user.AuthorityUser;

public class SeeAssignedTaskSceneController implements Initializable {
    private AuthorityUser au;
    

    @FXML
    private TableView<AssignedTasks> tableView;
    @FXML
    private TableColumn<AssignedTasks, String> taskIDColumn;
    @FXML
    private TableColumn<AssignedTasks, String> TaskNameColumn;
    @FXML
    private TableColumn<AssignedTasks, String> ShiftColumn;
    @FXML
    private TableColumn<AssignedTasks, String> DateColumn;
    @FXML
    private TableColumn<AssignedTasks, String> StartTimeColumn;
    @FXML
    private TableColumn<AssignedTasks, String> EndColumn;
    
    public void data(AuthorityUser au) {
        this.au = au;
        
        ArrayList<AssignedTasks> list = SecurityInCharge.getAssignedTasksList();
        for (int i = 0; i < list.size(); i ++) {
            if(list.get(i).getU().getId() == au.getId() &&
                    !list.get(i).getT().getTaskStatus().equals("Complete")) {
                tableView.getItems().add(list.get(i));
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        taskIDColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(Integer.toString(cellData.getValue().getT().getTaskId()));});
        TaskNameColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().getT().getTaskname());});
        ShiftColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().getT().getShift().getShift());});
        DateColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().getT().getShift().getDate().toString());});
        StartTimeColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().getT().getShift().getStartTime());});
        EndColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().getT().getShift().getEndTime());});
        
        // TODO
    }    

    @FXML
    private void seeTasksDescriptionButtonOnClick(MouseEvent event) throws IOException {
        AssignedTasks at = tableView.getSelectionModel().getSelectedItem();
        
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TaskDescription.fxml"));
        Parent root = loader.load();
        TaskDescriptionController ctrl = loader.getController();
        ctrl.data(at);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
    }

    @FXML
    private void sendCompletionDescription(MouseEvent event) throws IOException {
        AssignedTasks at = tableView.getSelectionModel().getSelectedItem();
        
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SendTaskDescriptionToSIncharge.fxml"));
        Parent root = loader.load();
        SendTaskDescriptionToSInchargeController ctrl = loader.getController();
        ctrl.data(at);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
    }
    
}
