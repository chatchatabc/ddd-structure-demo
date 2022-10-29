package com.chatchatabc.cargo.impl.domain.repository;

import com.chatchatabc.cargo.SpringBootBaseTest;
import com.chatchatabc.cargo.domain.model.Cargo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class CargoRepositoryImplTest extends SpringBootBaseTest {
    @Autowired
    private CargoRepositoryImpl cargoRepository;

    @Test
    public void testFindCargoById() {
        final Cargo cargo = cargoRepository.findCargoById(1L);
        assertThat(cargo).isNotNull();
        System.out.println(cargo.getTrackingId());
    }
}
