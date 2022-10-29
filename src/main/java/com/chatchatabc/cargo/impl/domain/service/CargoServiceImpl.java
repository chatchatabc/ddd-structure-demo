package com.chatchatabc.cargo.impl.domain.service;

import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.service.CargoService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class CargoServiceImpl implements CargoService {
    @Override
    public Long createCargo(@NotNull Cargo cargo) {
        return 1L;
    }
}
