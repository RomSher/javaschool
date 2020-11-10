package ru.example;

public class Cats extends Animals{

    public Cats() {
        super("No name","No color",0);
        setType("Cat");
    }

    public Cats (String name, String color, int age){
        super(name, color, age);
        setType("Cat");
    }

    @Override
    public String voice() {
        return "Mur-Mur";
    }
    @Override
    public String ration() {
        return "Mouse";
    }
    @Override
    public String skill() {
        return "Climb trees";
    }
    @Override
    public boolean canMove() {
        return true;
    }
 }
