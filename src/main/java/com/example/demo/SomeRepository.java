package com.example.demo;

public interface SomeRepository {
    void save(Item item);
    void delete(String key);

    String get(String key);
}
