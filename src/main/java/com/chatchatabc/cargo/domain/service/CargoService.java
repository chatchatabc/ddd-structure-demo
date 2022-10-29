package com.chatchatabc.cargo.domain.service;

import com.chatchatabc.cargo.domain.model.Cargo;
import org.jetbrains.annotations.NotNull;
import org.jmolecules.ddd.annotation.Service;

@Service
public interface CargoService {
    Long createCargo(@NotNull Cargo cargo);
}
