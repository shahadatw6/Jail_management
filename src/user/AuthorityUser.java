/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mainpkg.FileToObList;
import mainpkg.ITOfficers.Ticket;

/**
 *
 * @author calsifer
 */
public class AuthorityUser extends User implements Serializable{
    public LocalDate dob;
    public  LocalDate doj;
    protected String contactNo;
    protected String email;

    public AuthorityUser(int id, String name, String password, String userType,LocalDate dob, LocalDate doj, String contactNo, String email) {
        super(id, name, password, userType);
        this.dob = dob;
        this.doj = doj;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "AuthorityUser{" + "dob=" + dob + ", doj=" + doj + ", contactNo=" + contactNo + ", email=" + email + '}';
    }

public void addTicket(Ticket ticket) {
    ObservableList<Ticket> existingTickets = FXCollections.observableArrayList(FileToObList.readObjectsFromFile("TicketList.bin"));
    existingTickets.add(ticket);
    FileToObList.writeObjectsToFile(existingTickets, "TicketList.bin");
}

    
    private static int ticketCounter = 1; // Counter for generating ticket IDs

    // ... Other methods ...

    protected int generateTicketID() {
        return ticketCounter++;
    }

    public void requestHelpDesk(String title, String description, String userSender) {
        Ticket newTicket = new Ticket(
            generateTicketID(),   // You need to implement this method to generate unique ticket IDs
            title,
            description,
            LocalDate.now(),     // The current date as the open date
            null,                // No closed date initially
            userSender,                // The sender's name
            "Pending" ,  
                null// Initial status is set to "Pending"
        );
        addTicket(newTicket);

 
}
 
}
