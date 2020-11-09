package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogsTest {

    Dogs dog = new Dogs();

    @Test
    void voice() {
        dog.voice();
    }

    @Test
    void ration() {
        dog.ration();
    }

    @Test
    void skill() {
        dog.skill();
    }
}