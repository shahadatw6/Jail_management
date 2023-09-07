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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import mainpkg.ITOfficers.ITOfficer;
import user.AuthorityUser;

/**
 * FXML Controller class
 *
 * @author calsifer
 */
public class BarChartController implements Initializable {

    @FXML
    private BarChart<String, Number> barchartFxId;
    @FXML
    private LineChart<String, Number> lineChartfxId;
    @FXML
    private Label barchartLabel;
    @FXML
    private Label linechartlabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    XYChart.Series<String, Number> series = new XYChart.Series<>();
    XYChart.Series<String, Number> barChartSeries = new XYChart.Series<>();


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

    // Populate pieChartData with user type counts
    for (String userType : userTypes) {
        int count = userTypeCounts.get(userTypes.indexOf(userType));
            series.getData().add(new XYChart.Data<>(userType, count));
            barChartSeries.getData().add(new XYChart.Data<>(userType, count));
            System.out.println(userType +"----"+ count);
    }    
    barchartFxId.getData().add(barChartSeries);
            barchartFxId.setTitle("Bar Chart Example");
            
            
        barchartFxId.setLegendVisible(true);
    lineChartfxId.getData().add(series);
    
    } 
    
}
