package com.example.demo;

public class SpyRepository implements SomeRepository{
    public String get_argumentKey;

    @Override
    public void save(Item item) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public String get(String key) {
        get_argumentKey = key;
        return null;
    }
}
