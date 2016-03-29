package com.teamHR.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by Ashutosh on 13-Mar-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "Client")
public class Client extends Entity{
    @Id
    private long id;
    private String clientId;
    private boolean active;
    private String clientName;
    private List<String> locations;
    private List<String> clientOperations;
    private List<PointOfContact> pointOfContacts;



    public long getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<String> getClientOperations() {
        return clientOperations;
    }

    public void setClientOperations(List<String> clientOperations) {
        this.clientOperations = clientOperations;
    }

    public List<PointOfContact> getPointOfContacts() {
        return pointOfContacts;
    }

    public void setPointOfContacts(List<PointOfContact> pointOfContacts) {
        this.pointOfContacts = pointOfContacts;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", locations=" + locations +
                ", clientOperations=" + clientOperations.toArray() +
                ", pointOfContacts=" + pointOfContacts.toString() +
                '}';
    }
}
