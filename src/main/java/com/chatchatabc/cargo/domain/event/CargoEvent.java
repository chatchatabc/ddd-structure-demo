package com.chatchatabc.cargo.domain.event;

import com.chatchatabc.cargo.domain.model.Cargo;
import org.jmolecules.event.annotation.DomainEvent;

/**
 * Cargo event
 *
 * @author linux_china
 */
@DomainEvent
public class CargoEvent {
    public static String PLACED_TYPE = "placed";
    public static String SHIPPED_TYPE = "created";
    public static String ARRIVED_TYPE = "blocked";

    private String type;
    private Cargo cargo;

    public CargoEvent(String type, Cargo cargo) {

    }
}
