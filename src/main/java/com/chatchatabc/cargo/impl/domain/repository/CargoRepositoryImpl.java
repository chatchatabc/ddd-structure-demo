package com.chatchatabc.cargo.impl.domain.repository;


import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.model.Location;
import com.chatchatabc.cargo.domain.repository.CargoRepository;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class CargoRepositoryImpl implements CargoRepository {

    @Nullable
    @Override
    public Cargo findCargoById(Long id) {
        if (id <= 0) {
            return null;
        }
        final Cargo cargo = new Cargo(1L, UUID.randomUUID().toString(), new Location(1L, "Davao"));
        cargo.setStatus(0);
        return cargo;
    }

    @Override
    public Long insertCargo(Cargo cargo) {
        return 1L;
    }
}
