package com.teamHR.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Ashutosh on 13-Mar-16.
 */

@Document(collection = "PointOfContact")
public class PointOfContact extends Entity{
    @Id
    private long id;
    private String name;
    private String email;
    private String mobile;
    private String preferredContactMedium;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPocName() {
        return name;
    }

    public void setPocName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPreferredContactMedium() {
        return preferredContactMedium;
    }

    public void setPreferredContactMedium(String preferredContactMedium) {
        this.preferredContactMedium = preferredContactMedium;
    }

    @Override
    public String toString() {
        return "PointOfContact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", preferredContactMedium='" + preferredContactMedium + '\'' +
                '}';
    }
}
