package com.chatchatabc.cargo.impl.domain.specification;

import com.chatchatabc.cargo.domain.specification.CargoSpec;

import java.util.Optional;

/**
 * Cargo Specification implementation
 *
 * @author linux_china
 */
public class CargoSpecImpl implements CargoSpec {
    @Override
    public Optional<Long> isEmailUnique(String email) {
        return Optional.empty();
    }

    public boolean isTrackingNumberUnique(String trackingNum) {
        return false;
    }
}
