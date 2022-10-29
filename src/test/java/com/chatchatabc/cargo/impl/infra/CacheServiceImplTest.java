package com.chatchatabc.cargo.impl.infra;

import com.chatchatabc.cargo.domain.model.Cargo;
import com.chatchatabc.cargo.domain.model.Location;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * CacheServiceImpl test
 *
 * @author linux_china
 */
public class CacheServiceImplTest {

    private final CacheServiceImpl cacheService = new CacheServiceImpl();

    @Test
    public void testCacheOperation() {
        String id = "cargo-1";
        Cargo cargo = new Cargo(1L, "35a2d53f-7cb9-4b02-bd7f-263ba1fde7c5", new Location(1L, "Davao"));
        cacheService.put(id, cargo);
        final Cargo cargo2 = cacheService.get(id, Cargo.class);
        Assertions.assertThat(cargo2).isNotNull();
    }
}
