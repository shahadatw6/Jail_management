/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package chartpractice;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import mainpkg.ITOfficers.ITOfficer;
import user.AuthorityUser;

/**
 * FXML Controller class
 *
 * @author calsifer
 */
public class PieChartController implements Initializable {

    @FXML
    private PieChart piechart;
    @FXML
    private Label pieChartLabel;


    /**
     * Initializes the controller class.
     */
    @Override

public void initialize(URL url, ResourceBundle rb) {
    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
    ObservableList<AuthorityUser> tempList = ITOfficer.showUsers();
    List<String> userTypes = new ArrayList<>();

    for (AuthorityUser authorityUser : tempList) {
        String authorityUserType = authorityUser.getUserType();
        if (!userTypes.contains(authorityUserType)) {
            userTypes.add(authorityUserType);
        }
    }

    List<Integer> userTypeCounts = new ArrayList<>(userTypes.size());
    for (int i = 0; i < userTypes.size(); i++) {
        userTypeCounts.add(0);
    }

    for (AuthorityUser authorityUser : tempList) {
        String userType = authorityUser.getUserType();
        userTypeCounts.set(userTypes.indexOf(userType), userTypeCounts.get(userTypes.indexOf(userType)) + 1);
    }

    for (String userType : userTypes) {
        int count = userTypeCounts.get(userTypes.indexOf(userType));
        System.out.println(userType +"----"+ count);
        pieChartData.add(new PieChart.Data(userType, count));
    }

    // Set the pie chart data
    piechart.setData(pieChartData);
    
    
    for(PieChart.Data pieChartdata : piechart.getData()){
        pieChartdata.getNode().setOnMouseClicked(event->{
            pieChartLabel.setText(pieChartdata.toString());
        }
                );
    }
}
}
