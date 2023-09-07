/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonguard;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author raiha
 */
public class IncidentReport implements Serializable {
    private String Report;
    private LocalDate IncidentDate;

    public IncidentReport(String Report, LocalDate IncidentDate) {
        this.Report = Report;
        this.IncidentDate = IncidentDate;
    }
    
    

    public String getReport() {
        return Report;
    }

    public void setReport(String Report) {
        this.Report = Report;
    }

    public LocalDate getIncidentDate() {
        return IncidentDate;
    }

    public void setIncidentDate(LocalDate IncidentDate) {
        this.IncidentDate = IncidentDate;
    }
    
    
}
