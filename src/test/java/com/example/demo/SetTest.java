package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SetTest {
    @Test
    void isEmpty_returnsTrue() {
        Set set = new Set();

        assertThat(set.isEmpty()).isTrue();
    }

    @Test
    void isEmpty_returnsTrue_afterDeleting() {
        Set set = new Set();
        set.add("1");
        set.remove("1");

        assertThat(set.isEmpty()).isTrue();
    }

    @Test
    void isEmpty_returnsFalse() {
        Set set = new Set();
        set.add("1");

        assertThat(set.isEmpty()).isFalse();
    }

    @Test
    void checkExist_returnsTrue() {
        Set set = new Set();
        set.add("1");

        assertThat(set.checkExist("1")).isTrue();
    }

    @Test
    void checkExist_returnsTrueWith2elements() {
        Set set = new Set();
        set.add("1");
        set.add("2");

        assertThat(set.checkExist("1")).isTrue();
        assertThat(set.checkExist("2")).isTrue();
    }

    @Test
    void checkExist_returnsFalse() {
        Set set = new Set();
        set.add("1");

        assertThat(set.checkExist("2")).isFalse();
    }

    @Test
    void size_returnsSizeOfArray() {
        Set set = new Set();
        set.add("1");
        set.add("2");
        set.add("3");

        assertThat(set.size()).isEqualTo(3);
    }

    @Test
    void remove_deletesAElement() {
        Set set = new Set();
        set.add("1");
        set.add("2");
        set.add("3");

        set.remove("2");

        assertThat(set.size()).isEqualTo(2);
        assertThat(set.checkExist("1")).isTrue();
        assertThat(set.checkExist("2")).isFalse();
        assertThat(set.checkExist("3")).isTrue();
    }

    @Test
    void add_extendsArraySize() {
        Set set = new Set(1);

        set.add("1");
        set.add("2");

        assertThat(set.size()).isEqualTo(2);
        assertThat(set.checkExist("2")).isTrue();
    }
}
