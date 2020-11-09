package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogsTest {

    Dogs dog = new Dogs();

    @Test
    void ration() {
        assertEquals("Bones",dog.ration());
    }

}