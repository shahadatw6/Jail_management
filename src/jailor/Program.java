

package jailor;

import java.io.Serializable;


public class Program implements Serializable {
    
    private String programName;
    private int programID;

    public Program(String programName, int programID) {
        this.programName = programName;
        this.programID = programID;
    }
    

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }
    
    
    
    
}
