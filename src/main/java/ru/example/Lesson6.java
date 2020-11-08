package ru.example;

public class Lesson6 {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Marfa", "black", 10);
        Cats cat2 = new Cats();
        Dogs dog1 = new Dogs("Bobik", "white", 5);
        Dogs dog2 = new Dogs();
        cat1.aboutMe();
        dog1.aboutMe();
     }
}