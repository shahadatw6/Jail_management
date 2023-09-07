/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securityincharge;

import applications.Application;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import user.NonAuthorityUser;

/**
 *
 * @author calsifer
 */
public class Schedule implements Serializable{
    private LocalDate date;
    private String startTime;
    private String endTime;
    private String activity;
    private NonAuthorityUser  nonAuthorityUser;
    private Application application;

    public Schedule(LocalDate date, String startTime, String endTime, String activity, NonAuthorityUser nonAuthorityUser, Application application) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
        this.nonAuthorityUser = nonAuthorityUser;
        this.application = application;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public NonAuthorityUser getNonAuthorityUser() {
        return nonAuthorityUser;
    }

    public void setNonAuthorityUser(NonAuthorityUser nonAuthorityUser) {
        this.nonAuthorityUser = nonAuthorityUser;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "Schedule{" + "date=" + date + ", startTime=" + startTime + ", endTime=" + endTime + ", activity=" + activity + ", nonAuthorityUser=" + nonAuthorityUser + ", application=" + application + '}';
    }


    }

    
    
    

    
