

package jailor;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.ArrayList;

public class Prisoner implements Serializable {
    private String name;
    private int nid;
    private LocalDate dateOfBirth;
    private int prisoner_id;
    private String gender;
    private String prisonCellBlock;
    private String Status;
    private ArrayList<CaseDetail> CaseList = new ArrayList<>();

    public Prisoner(String name, int nid, LocalDate dateOfBirth, int prisoner_id, String gender, String prisonCellBlock, String Status) {
        this.name = name;
        this.nid = nid;
        this.dateOfBirth = dateOfBirth;
        this.prisoner_id = prisoner_id;
        this.gender = gender;
        this.prisonCellBlock = prisonCellBlock;
        this.Status = Status;
    }

    public String getName() {
        return name;
    }

    public int getNid() {
        return nid;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPrisoner_id() {
        return prisoner_id;
    }

    public String getGender() {
        return gender;
    }

    public String getPrisonCellBlock() {
        return prisonCellBlock;
    }

    public String getStatus() {
        return Status;
    }

    public void setPrisonCellBlock(String prisonCellBlock) {
        this.prisonCellBlock = prisonCellBlock;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ArrayList<CaseDetail> getCaseList() {
        return CaseList;
    }

    public void setCaseList(ArrayList<CaseDetail> CaseList) {
        this.CaseList = CaseList;
    }
    
}