package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatsTest {

    Cats cat = new Cats();

     @Test
    void canMove() {
         assertTrue(cat.canMove());
    }


}