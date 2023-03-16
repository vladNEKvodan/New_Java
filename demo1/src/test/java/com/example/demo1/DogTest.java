package com.example.demo1;

import com.example.demo1.Dog;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class DogTest {

    static Dog dog;

    @BeforeAll
    static void new_dog() {
        dog = new Dog("Silver", 2, "Antoha", true);
    }

    @AfterAll
    static void last() {
        dog = new Dog("Final", 2, "Vadim", true);
    }

    @AfterEach
    void zamena(){
        dog = new Dog("False", 2, "Antoha", true);
    }

    @BeforeEach
    void prepareData() {
        dog = new Dog("Alberts", 2, "Antoha", true);
    }

    @Test
    void getName() {
        assertEquals("Alberts", dog.getName());
    }

    @Test
    @Tag("Array")
    void getListOfOwners() {
        assertArrayEquals(new String[]{"Antoha"}, dog.getOwners().toArray());
    }

    @Test
    void Iterable() {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,4));

        assertIterableEquals(listOne, listTwo);
    }

    @Test
    void time() {
        assertTimeout(Duration.ofMillis(100), () ->{
            Thread.sleep(50);
            return;
        });
    }

    @Test
    void Same() {
        assertSame(dog.getAge(), 2);
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @Test
    void throws_exc () {
        NumberFormatException thrown = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        }, "NumberFormatException was expected");
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertNotNull(dog.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @Test
    void proverka_hoz() {
        assumeTrue(dog.getHas_owner());
    }

    @Test
    void time_out() {

    }
}