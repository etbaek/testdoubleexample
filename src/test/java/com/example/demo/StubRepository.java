package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class StubRepository implements SomeRepository{
    String get_returnValue = "";
    @Override
    public void save(Item item) {
    }

    @Override
    public void delete(String item) {

    }

    @Override
    public String get(String key) {
        return get_returnValue;
    }
}
