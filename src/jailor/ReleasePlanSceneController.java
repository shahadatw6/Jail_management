

package jailor;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class ReleasePlanSceneController implements Initializable {

    @FXML
    private TextField prisonerIDTextField;
    @FXML
    private DatePicker releaseDateDatePicker;
    @FXML
    private TextField prisonerNameTextField;
    @FXML
    private TextArea DescriptionTextArea;
    private Prisoner p = null;
    @FXML
    private TextArea showCrimesTextarea;
    @FXML
    private TextField requestIDTextField;
    @FXML
    private TextField requestTypeTextField;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void loadPrisonerInfoOnClick(MouseEvent event) {
        p = Jailor.getPrisonerByPrisonerID(Integer.parseInt(prisonerIDTextField.getText()));
        if(p == null) {
            Jailor.showAlert("Prisoner Not Found !!!");
            return;
        }
        prisonerNameTextField.setText(p.getName());
        showCrimesTextarea.setText("");
        for (int i = 0; i < p.getCaseList().size(); i ++) {
            showCrimesTextarea.appendText(
            "Case ID: " + p.getCaseList().get(i).getCaseNo() + 
            ", Crime: " + p.getCaseList().get(i).getCrime() + 
            ", Sentence Duration: " + p.getCaseList().get(i).getSentenceDuration() + "\n"
            );
        }
    }

    @FXML
    private void addReleasePlanButtonOnClick(MouseEvent event) {
        LocalDate releaseDate = releaseDateDatePicker.getValue();
        String Description = DescriptionTextArea.getText();
        ReleasePlan rp = new ReleasePlan(p, Description, releaseDate);
        Jailor.AddReleasePlan(rp);
        String message = 
            "Prisoner ID: " + rp.getP().getPrisoner_id() +
            ", Prisoner Name: " + rp.getP().getName() + 
            ", Proposed Released Date: " + rp.getProposedReleasedate().toString() + 
            "\nDescription: \n" + rp.getDescription() + "\n";
        
        int requestID = Integer.parseInt(requestIDTextField.getText());
        String requestType = requestTypeTextField.getText();
        Request request;
        request = new Request(
                requestID,
                requestType,
                "Jailor",
                LocalDate.now(),
                message);
        Jailor.sendRequest(request);
        Jailor.showAlert(message + "\n" + "Sent to DG");
        
    }
    
}
