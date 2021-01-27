package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Cats {
    private final Status status;
    private final String type;
    private final Boolean deleted;
    private final String id;
    private final String user;
    private final String text;
    private final Integer v;
    private final String source;
    private final String updatedAt;
    private final String createdAt;
    private final Boolean used;


    public Cats(
            @JsonProperty("status") Status status,
            @JsonProperty("type") String type,
            @JsonProperty("deleted") Boolean deleted,
            @JsonProperty("_id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") Integer v,
            @JsonProperty("source") String source,
            @JsonProperty("updatedAt") String updatedAt,
            @JsonProperty("createdAt") String createdAt,
            @JsonProperty("used") Boolean used) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this.id = id;
        this.user = user;
        this.text = text;
        this.v = v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    public Status getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public String getId() {
        return id;
    }


    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public Integer getV() {
        return v;
    }

    public String getSource() {
        return source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Boolean getUsed() {
        return used;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(status, cats.status) &&
                Objects.equals(type, cats.type) &&
                Objects.equals(deleted, cats.deleted) &&
                Objects.equals(id, cats.id) &&
                Objects.equals(user, cats.user) &&
                Objects.equals(text, cats.text) &&
                Objects.equals(v, cats.v) &&
                Objects.equals(source, cats.source) &&
                Objects.equals(updatedAt, cats.updatedAt) &&
                Objects.equals(createdAt, cats.createdAt) &&
                Objects.equals(used, cats.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, deleted, id, user, text, v, source, updatedAt, createdAt, used);//
    }

    @Override
    public String toString() {
        return "Cats{" +
                "status=" + status +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", v=" + v +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used='" + used + '\'' +
                '}';
    }
}
