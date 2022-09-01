package com.example.demo;

public class Example {
    SomeRepository someRepository;

    public Example(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    String testMethod(String a) {
        Item item = new Item();
        item.setKey(a);
        item.setValue("value+"+a);
        someRepository.save(item);
        return someRepository.get(a);
    }

    String stubMethod(String a) {
        return someRepository.get(a) + "test";
    }

    String dummyMethod() {
        someRepository.save(new Item("",""));
        someRepository.get("1");

        return "a";
    }
}
