package com.example.demo;

public class Set {
    String[] elements;
    public Set(int size) {
        elements = new String[size];
    }

    public Set() {
        elements = new String[10];
    }

    int count = 0;
    public boolean isEmpty() {
        return count==0;
    }

    public void add(String element) {
        if(elements.length == count) {
            extendArray();
        }
        elements[count] = element;
        count++;
    }

    private void extendArray() {
        String[] temp = elements;
        elements = new String[count*2];
        System.arraycopy(temp, 0, elements, 0, count);
    }

    public boolean checkExist(String element) {
        return indexOf(element) != -1;
    }

    public int size() {
        return count;
    }

    public void remove(String element) {
        int index = indexOf(element);
        if(index == -1) return;
        elements[index] = elements[count-1];
        count--;
    }

    private int indexOf(String element) {
        for(int i =0; i<count; i++) {
            if(elements[i].equals(element)) return i;
        }

        return -1;
    }
}
