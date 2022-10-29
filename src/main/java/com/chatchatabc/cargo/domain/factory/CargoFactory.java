package com.chatchatabc.cargo.domain.factory;

import com.chatchatabc.cargo.domain.model.Cargo;
import org.jmolecules.ddd.annotation.Factory;

@Factory
public interface CargoFactory {
    Cargo createCargoFromOrder(String orderId);
}
