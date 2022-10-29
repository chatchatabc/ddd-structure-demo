package com.chatchatabc.cargo.application.dubbo;

import com.chatchatabc.cargo.domain.model.Cargo;
import reactor.util.annotation.Nullable;

/**
 * Cargo service facade
 *
 * @author linux_china
 */
public interface CargoServiceFacade {
    @Nullable
    public Cargo findById(Long id);
}
