package com.chatchatabc.cargo.impl.domain.factory;


import com.chatchatabc.cargo.domain.factory.CargoFactory;
import com.chatchatabc.cargo.domain.model.Cargo;
import org.springframework.stereotype.Component;

@Component
public class CargoFactoryImpl implements CargoFactory {
    @Override
    public Cargo createCargoFromOrder(String orderId) {
        return null;
    }
}
