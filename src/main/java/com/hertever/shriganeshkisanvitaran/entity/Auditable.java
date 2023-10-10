package com.hertever.shriganeshkisanvitaran.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public abstract class Auditable implements Serializable {
    @Id
    private String id;

    @CreatedDate // hibernate
    private Date createdAt;

    @LastModifiedDate // hibernate
    private Date updatedAt;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auditable auditable = (Auditable) o;
        if (id == null || auditable.id == null) return false;
        return id.equals(auditable.id);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
