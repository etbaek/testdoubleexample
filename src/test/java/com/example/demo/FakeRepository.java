package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class FakeRepository implements SomeRepository{
    Map<String, String> items = new HashMap<>();
    @Override
    public void save(Item item) {
        items.put(item.key, item.value);
    }

    @Override
    public void delete(String key) {
        items.remove(key);
    }

    @Override
    public String get(String key) {
        return items.get(key);
    }
}
