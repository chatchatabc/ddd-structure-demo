package com.chatchatabc.cargo.domain.model;


import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import java.io.Serializable;

@Entity
public class Cargo implements Serializable {
    @Identity
    private Long id;
    private String trackingId;
    private Location origin;
    private Integer status;

    public Cargo() {
    }

    public Cargo(Long id, String trackingId, Location origin) {
        this.id = id;
        this.trackingId = trackingId;
        this.origin = origin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
