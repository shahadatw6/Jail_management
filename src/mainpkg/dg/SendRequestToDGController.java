/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg.dg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import mainpkg.Trainer.Trainer;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SendRequestToDGController implements Initializable {

    @FXML
    private TextField reqeustIdFxid;
    @FXML
    private TextField requestTypeFxid;

    @FXML
    private DatePicker requestTimeDatePickerFxid;

    @FXML
    private TextField requestDescriptionFxid;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void sendRequestToDGButtonOnClick(ActionEvent event) {
        
        Request request;
        request = new Request(
                Integer.parseInt(reqeustIdFxid.getText()),
                requestTypeFxid.getText(),
                 requestTimeDatePickerFxid.getValue(),
                requestDescriptionFxid.getText()
                ,false  );
        
        
        System.out.print(request.toString());
    


Trainer.sendRequest(request);
        
    }
}

        
        
        
        
        
