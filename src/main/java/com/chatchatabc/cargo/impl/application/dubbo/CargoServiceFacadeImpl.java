package com.chatchatabc.cargo.impl.application.dubbo;

import com.chatchatabc.cargo.application.dubbo.CargoServiceFacade;
import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.model.Location;

/**
 * CargoServiceFacade implementation
 *
 * @author linux_china
 */
public class CargoServiceFacadeImpl implements CargoServiceFacade {
    @Override
    public Cargo findById(Long id) {
        final Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setOrigin(new Location(111L, "Davao"));
        cargo.setTrackingId("9f46c7e5-26ba-4c3d-8cc1-4bbf062d1ed6");
        cargo.setStatus(0);
        return cargo;
    }
}
