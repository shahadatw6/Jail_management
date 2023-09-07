
package financeandaccounting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import user.AuthorityUser;


public class PaySalarySceneController implements Initializable {

    @FXML
    private TextField EmployeeIDTextField;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private TextField yearTextField;
    @FXML
    private TextField baseSalaryTextField;
    @FXML
    private TextField BonusTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthComboBox.getItems().addAll(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December");
        // TODO
    }    

    @FXML
    private void PaySalaryToEmployeeButtonOnClick(MouseEvent event) {
        int EmployeeID = Integer.parseInt(EmployeeIDTextField.getText());
        String Month = monthComboBox.getValue();
        int Year = Integer.parseInt(yearTextField.getText());
        int BaseSalary = Integer.parseInt(baseSalaryTextField.getText());
        int Bonus = Integer.parseInt(BonusTextField.getText());
        AuthorityUser e = FinanceAndAccountOfficer.getInstance(EmployeeID);
        if(e == null) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information Alert");
            a.setHeaderText("Alert");
            a.setContentText("Employee not found !");
            a.showAndWait();
            return;
        }
        Salary s = new Salary(e, Month, Year, EmployeeID, BaseSalary, Bonus);
        if(FinanceAndAccountOfficer.CheckSalaryExistence(s)) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information Alert");
            a.setHeaderText("Alert");
            a.setContentText("Salary has already been paid!");
            a.showAndWait();
        }
        else {
            FinanceAndAccountOfficer.PaySalary(s);
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information Alert");
            a.setHeaderText("Alert");
            a.setContentText("Salary has been paid!");
            a.showAndWait();
            
        }
    }
}
