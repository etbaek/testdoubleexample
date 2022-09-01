package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class testDoubleTest {
    @Nested
    class FakeTest{
        FakeRepository fakeRepository;
        Example testDoubles;
        @BeforeEach
        void setUp() {
            fakeRepository = new FakeRepository();
            testDoubles = new Example(fakeRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            String result = testDoubles.testMethod("test");

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
        Example testDoubles;
        @BeforeEach
        void setUp() {
            spyRepository = new SpyRepository();
            testDoubles = new Example(spyRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            testDoubles.stubMethod("input");

            assertThat(spyRepository.get_argumentKey).isEqualTo("input");
        }
    }

    @Nested
    class DummyClass {
        DummyRepository dummyRepository;
        Example testDoubles;
        @BeforeEach
        void setUp() {
            dummyRepository = new DummyRepository();
            testDoubles = new Example(dummyRepository);
        }

        @Test
        void testMethod_returnsTrue() {
            String result = testDoubles.dummyMethod();

            assertThat(result).isEqualTo("a");
        }
    }
}
