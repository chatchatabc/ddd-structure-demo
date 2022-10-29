package com.chatchatabc.cargo.impl.domain.repository;


import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.model.Location;
import com.chatchatabc.cargo.domain.repository.CargoRepository;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public class CargoRepositoryImpl implements CargoRepository {
    @Nullable
    @Override
    public Cargo findCargoById(Long id) {
        return new Cargo(1L, "ups-20210309110234", new Location(1L, "LA"));
    }
}
