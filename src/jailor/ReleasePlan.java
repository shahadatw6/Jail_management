

package jailor;

import java.io.Serializable;
import java.time.LocalDate;


public class ReleasePlan implements Serializable {
    
    private Prisoner p;
    private String Description;
    LocalDate proposedReleasedate;

    public ReleasePlan(Prisoner p, String Description, LocalDate proposedReleasedate) {
        this.p = p;
        this.Description = Description;
        this.proposedReleasedate = proposedReleasedate;
    }
    
    
    

    public Prisoner getP() {
        return p;
    }

    public void setP(Prisoner p) {
        this.p = p;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public LocalDate getProposedReleasedate() {
        return proposedReleasedate;
    }

    public void setProposedReleasedate(LocalDate proposedReleasedate) {
        this.proposedReleasedate = proposedReleasedate;
    }
    
    
    
    
    
}
