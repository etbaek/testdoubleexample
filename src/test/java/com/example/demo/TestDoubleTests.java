package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestDoubleTests {
    @Nested
    class FakeTest{
        FakeRepository fakeRepository;
        Example example;
        @BeforeEach
        void setUp() {
            fakeRepository = new FakeRepository();
            example = new Example(fakeRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            String result = example.testMethod("test");

            assertThat(result).isEqualTo("value+test");
        }
    }

    @Nested
    class StubTest{
        StubRepository stubRepository;
        Example example;
        @BeforeEach
        void setUp() {
            stubRepository = new StubRepository();
            example = new Example(stubRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            stubRepository.get_returnValue = "abc";
            String result = example.stubMethod("");

            assertThat(result).isEqualTo("abctest");
        }
    }

    @Nested
    class SpyTest{
        SpyRepository spyRepository;
        Example example;
        @BeforeEach
        void setUp() {
            spyRepository = new SpyRepository();
            example = new Example(spyRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            example.stubMethod("input");

            assertThat(spyRepository.get_argumentKey).isEqualTo("input");
        }
    }

    @Nested
    class DummyClass {
        DummyRepository dummyRepository;
        Example example;
        @BeforeEach
        void setUp() {
            dummyRepository = new DummyRepository();
            example = new Example(dummyRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            String result = example.dummyMethod();

            assertThat(result).isEqualTo("a");
        }
    }
}
