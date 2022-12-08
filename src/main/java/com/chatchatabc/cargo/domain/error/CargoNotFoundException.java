package com.chatchatabc.cargo.domain.error;

/**
 * Cargo not found exception by id or tracking id
 *
 * @author linux_china
 */
public class CargoNotFoundException extends Exception {
    private Long id;
    private String trackingId;

    public CargoNotFoundException byId(Long id) {
        CargoNotFoundException e = new CargoNotFoundException();
        e.id = id;
        return e;
    }

    public CargoNotFoundException byTrackingId(String trackingId) {
        CargoNotFoundException e = new CargoNotFoundException();
        e.trackingId = trackingId;
        return e;
    }

    public Long getId() {
        return id;
    }

    public String getTrackingId() {
        return trackingId;
    }
}
