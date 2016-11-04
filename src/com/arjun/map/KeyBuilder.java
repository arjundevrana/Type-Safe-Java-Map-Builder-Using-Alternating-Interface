package com.arjun.map;

import java.util.Map;

public interface KeyBuilder <K, V> {
    ValueBuilder<K, V> key(K k);
    Map<K, V> build();
}