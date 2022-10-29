package com.chatchatabc.cargo.impl.domain.service;

import com.chatchatabc.cargo.SpringBootBaseTest;
import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.model.Location;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * CargoServiceImpl test
 *
 * @author linux_china
 */
public class CargoServiceImplTest extends SpringBootBaseTest {
    @Autowired
    private CargoServiceImpl cargoService;

    @Test
    void testCreateCargo() {
        Cargo cargo = new Cargo(0L, "c0e219ac-a01b-4d3a-8c7e-6a12c372d4d9", new Location(1L, "Davao"));
        cargoService.createCargo(cargo);
    }
}
