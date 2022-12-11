package com.chatchatabc.cargo.application.rest;

import com.chatchatabc.cargo.domain.error.CargoNotFoundException;
import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cargo Controller
 *
 * @author linux_china
 */
@RestController
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    private CargoRepository cargoRepository;

    @GetMapping("/{id}")
    public Cargo show(@PathVariable Long id) throws CargoNotFoundException {
        final Cargo cargo = cargoRepository.findCargoById(id);
        if (cargo == null) {
            throw CargoNotFoundException.byId(id);
        }
        return cargo;
    }
}
