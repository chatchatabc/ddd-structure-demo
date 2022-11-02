package com.chatchatabc.cargo.impl.domain.service;

import com.chatchatabc.cargo.domain.event.CargoEvent;
import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.repository.CargoRepository;
import com.chatchatabc.cargo.domain.service.CargoService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CargoServiceImpl implements CargoService {
    @Autowired
    ApplicationEventPublisher eventPublisher;
    @Autowired
    CargoRepository cargoRepository;

    @Override
    public Long createCargo(@NotNull Cargo cargo) {
        final Long cargoId = cargoRepository.insertCargo(cargo);
        eventPublisher.publishEvent(new CargoEvent(CargoEvent.PLACED_TYPE, cargo));
        return cargoId;
    }
}
