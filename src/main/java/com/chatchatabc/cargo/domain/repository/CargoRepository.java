package com.chatchatabc.cargo.domain.repository;

import com.chatchatabc.cargo.domain.model.Cargo;
import org.jetbrains.annotations.Nullable;
import org.jmolecules.ddd.annotation.Repository;

@Repository
public interface CargoRepository {
    @Nullable
    Cargo findCargoById(Long id);
}
