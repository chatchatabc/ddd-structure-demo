package com.chatchatabc.cargo.domain.specification;

import java.util.Optional;

/**
 * account specification
 *
 * @author linux_china
 */
public interface CargoSpec {
    Optional<Long> isEmailUnique(String email);
}
