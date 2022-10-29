package com.chatchatabc.cargo.infra;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jmolecules.ddd.annotation.Service;

import java.io.Serializable;

@Service
public interface CacheService {
    void put(String id, @NotNull Serializable obj);

    @Nullable <T> T get(String id, Class<T> clazz);
}
