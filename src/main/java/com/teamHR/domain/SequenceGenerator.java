package com.teamHR.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Ashutosh on 11-Mar-16.
 */
@Document(collection = "SEQUENCE-GENERATOR")
public class SequenceGenerator{
    @Id
    private String id;
    private int sequence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "SequenceGenerator{" +
                "id='" + id + '\'' +
                ", sequence=" + sequence +
                '}';
    }
}
