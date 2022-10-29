package com.chatchatabc.cargo.application.rest;

import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cargo Controller
 *
 * @author linux_china
 */
@RestController
public class CargoController {

    @GetMapping("/cargo/{id}")
    Cargo show(@PathVariable Long id) {
        final Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setOrigin(new Location(111L, "Davao"));
        cargo.setTrackingId("9f46c7e5-26ba-4c3d-8cc1-4bbf062d1ed6");
        cargo.setStatus(0);
        return cargo;
    }
}
