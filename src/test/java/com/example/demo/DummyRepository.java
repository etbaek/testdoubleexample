package com.example.demo;

public class DummyRepository implements SomeRepository{
    @Override
    public void save(Item item) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public String get(String key) {
        return null;
    }
}
