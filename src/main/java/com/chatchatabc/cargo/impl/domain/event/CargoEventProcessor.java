package com.chatchatabc.cargo.impl.domain.event;

import com.chatchatabc.cargo.domain.event.CargoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Cargo Event processor
 *
 * @author linux_china
 */
@Component
public class CargoEventProcessor {

    @EventListener(CargoEvent.class)
    @Async
    public void processCargoEvent(CargoEvent event) {
        System.out.println("Tracking numb:" + event.getCargo().getTrackingId());
    }
}
