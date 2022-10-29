package com.chatchatabc.cargo.impl.application.dubbo;

import com.chatchatabc.cargo.application.dubbo.CargoServiceFacade;
import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CargoServiceFacade implementation
 *
 * @author linux_china
 */
@Service
public class CargoServiceFacadeImpl implements CargoServiceFacade {
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public Cargo findById(Long id) {
        return cargoRepository.findCargoById(id);
    }
}
