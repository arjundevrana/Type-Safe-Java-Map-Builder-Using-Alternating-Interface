package com.arjun.map;

public interface ValueBuilder<K, V> {
    KeyBuilder<K, V> value(V v);
}