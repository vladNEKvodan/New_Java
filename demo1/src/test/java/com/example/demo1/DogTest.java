package com.example.demo1;

import com.example.demo1.Dog;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class DogTest {

    Dog dog = new Dog("Alberts", 2, "Antoha", true);


    @TestFactory
    Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Первый тест",
                        () -> assertEquals("Alberts", dog.getName())),
                DynamicTest.dynamicTest("Второй тест",
                        () -> assertEquals(2, dog.getAge())));
    }
    @RepeatedTest(3)
    void RepetedTest() {
        assertArrayEquals(new String[]{"Antoha"}, dog.getOwners().toArray());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Vlad", "Denis"})
    void paramtrized(String s) {
        assertNotNull(s);
    }
}