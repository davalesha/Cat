package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    private final Boolean verified;
    private final Integer sentCount;

    public Status(
            @JsonProperty("verified") Boolean verified,
            @JsonProperty("sentCount") Integer sentCount) {
        this.verified = verified;
        this.sentCount = sentCount;
    }

    public Boolean getVerified() {
        return verified;
    }


    public Integer getSentCount() {
        return sentCount;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                '}';
    }
}
