
package securityincharge;

import java.io.Serializable;
import user.AuthorityUser;

public class AssignedTasks implements Serializable {
    
    private Tasks t;
    private AuthorityUser u;
    private String TaskCompletionDescription;

    public AssignedTasks(Tasks t, AuthorityUser u) {
        this.t = t;
        this.u = u;
        this.TaskCompletionDescription = "";
    }

    public String getTaskCompletionDescription() {
        return TaskCompletionDescription;
    }

    public void setTaskCompletionDescription(String TaskCompletionDescription) {
        this.TaskCompletionDescription = TaskCompletionDescription;
    }
    

    public Tasks getT() {
        return t;
    }

    public void setT(Tasks t) {
        this.t = t;
    }

    public AuthorityUser getU() {
        return u;
    }

    public void setU(AuthorityUser u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "Task ID: " + this.t.getTaskId() + 
                ", Guard ID: " + this.u.getId() + 
                ", Task Name: " + this.t.getTaskname() + 
                ", Shift Name: " + this.t.getShift().getShift() + 
                ", Date: " + this.t.getShift().getDate().toString() + 
                ", Start Time: " + this.t.getShift().getStartTime() + 
                ", End Time: " + this.t.getShift().getEndTime() + 
                ", Status: " + this.t.getTaskStatus() + "\n";
    }
    
    
    
}
