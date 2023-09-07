

package jailor;

import java.io.Serializable;


public class Rehabilitation implements Serializable {
    private Program pr;
    private Prisoner p;

    public Rehabilitation(Program pr, Prisoner p) {
        this.pr = pr;
        this.p = p;
    }
    
    

    public Program getPr() {
        return pr;
    }

    public void setPr(Program pr) {
        this.pr = pr;
    }

    public Prisoner getP() {
        return p;
    }

    public void setP(Prisoner p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Prisoner ID: " + p.getPrisoner_id() + 
                " Name: " + p.getName() + 
                " Program ID + " + pr.getProgramID() + 
                " Program Name: " + pr.getProgramName();
    }
}
