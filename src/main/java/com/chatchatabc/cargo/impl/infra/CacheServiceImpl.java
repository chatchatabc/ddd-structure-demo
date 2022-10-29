package com.chatchatabc.cargo.impl.infra;

import com.chatchatabc.cargo.infra.CacheService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CacheServiceImpl implements CacheService {
    private final Map<String, Serializable> store = new ConcurrentHashMap<>();

    @Override
    public void put(String id, @NotNull Serializable obj) {
        this.store.put(id, obj);
    }

    @Nullable
    @Override
    public <T> T get(String id, Class<T> clazz) {
        //noinspection unchecked
        return (T) store.get(id);
    }
}
