package com.teamHR.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by Ashutosh on 13-Mar-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "Job")
public class Job extends Entity{
    @Id
    private long id;
    private String jobId;
    private String jobTitle;
    private int priority;
    private boolean active;
    private String jobType;
    private String client;
    private String clientPayrollOn;
    @DBRef
    private Client requirementRaisedBy;
    @DBRef
    private List<User> recruiters;
    private List<PointOfContact> pointOfContacts;
    private String jobLocation;
    private int positionCount;
    private Date deadLine;
    private int minimumExperienceRequired;
    private int maximumExperienceRequired;

    private int minimumPackage;
    private int maximumPackage;

    private String searchKeyWords;
    private String description;
    private String jdFile;
    private List<String> mandatoryFields;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClientPayrollOn() {
        return clientPayrollOn;
    }

    public void setClientPayrollOn(String clientPayrollOn) {
        this.clientPayrollOn = clientPayrollOn;
    }

    public Client getRequirementRaisedBy() {
        return requirementRaisedBy;
    }

    public void setRequirementRaisedBy(Client requirementRaisedBy) {
        this.requirementRaisedBy = requirementRaisedBy;
    }

    public List<User> getRecruiters() {
        return recruiters;
    }

    public void setRecruiters(List<User> recruiters) {
        this.recruiters = recruiters;
    }

    public List<PointOfContact> getPointOfContacts() {
        return pointOfContacts;
    }

    public void setPointOfContacts(List<PointOfContact> pointOfContacts) {
        this.pointOfContacts = pointOfContacts;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public int getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public int getMinimumExperienceRequired() {
        return minimumExperienceRequired;
    }

    public void setMinimumExperienceRequired(int minimumExperienceRequired) {
        this.minimumExperienceRequired = minimumExperienceRequired;
    }

    public int getMaximumExperienceRequired() {
        return maximumExperienceRequired;
    }

    public void setMaximumExperienceRequired(int maximumExperienceRequired) {
        this.maximumExperienceRequired = maximumExperienceRequired;
    }

    public int getMinimumPackage() {
        return minimumPackage;
    }

    public void setMinimumPackage(int minimumPackage) {
        this.minimumPackage = minimumPackage;
    }

    public int getMaximumPackage() {
        return maximumPackage;
    }

    public void setMaximumPackage(int maximumPackage) {
        this.maximumPackage = maximumPackage;
    }

    public String getSearchKeyWords() {
        return searchKeyWords;
    }

    public void setSearchKeyWords(String searchKeyWords) {
        this.searchKeyWords = searchKeyWords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJdFile() {
        return jdFile;
    }

    public void setJdFile(String jdFile) {
        this.jdFile = jdFile;
    }

    public List<String> getMandatoryFields() {
        return mandatoryFields;
    }

    public void setMandatoryFields(List<String> mandatoryFields) {
        this.mandatoryFields = mandatoryFields;
    }


    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", active=" + active +
                ", jobType='" + jobType + '\'' +
                ", client=" + client.toString() +
                ", clientPayrollOn='" + clientPayrollOn + '\'' +
                ", pointOfContacts=" + pointOfContacts.toArray() +
                ", jobLocation='" + jobLocation + '\'' +
                ", positionCount=" + positionCount +
                ", deadLine=" + deadLine +
                ", minimumExperienceRequired=" + minimumExperienceRequired +
                ", maximumExperienceRequired=" + maximumExperienceRequired +
                ", minimumPackage=" + minimumPackage +
                ", maximumPackage=" + maximumPackage +
                ", searchKeyWords='" + searchKeyWords + '\'' +
                ", description='" + description + '\'' +
                ", mandatoryFields=" + mandatoryFields.toArray() +
                '}';
    }
}
