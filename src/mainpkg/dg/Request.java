/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg.dg;

import java.io.Serializable;
import java.time.LocalDate;


public class Request implements Serializable {
    private int requestID;
    private String requestType;
    private String requestSender;
    private LocalDate requestTime;
    private String requestDescription;
    private Boolean requestStatus;

    public Request(int requestID, String requestType, LocalDate requestTime, String requestDescription, Boolean requestStatus) {
        this.requestID = requestID;
        this.requestType = requestType;
        this.requestTime = requestTime;
        this.requestDescription = requestDescription;
        this.requestStatus = requestStatus;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestSender() {
        return requestSender;
    }

    public void setRequestSender(String requestSender) {
        this.requestSender = requestSender;
    }

    public LocalDate getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDate requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public Boolean getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Boolean requestStatus) {
        this.requestStatus = requestStatus;
    }


    @Override
    public String toString() {
        return "Request{" + "requestID=" + requestID + ", requestType=" + requestType + ", requestSender=" + requestSender + ", requestTime=" + requestTime + ", requestDescription=" + requestDescription + ", requestStatus=" + requestStatus + '}';
    }
    
    
    

    
    
}
    
    
    
    
    
    
    
  