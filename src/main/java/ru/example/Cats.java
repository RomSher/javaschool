package ru.example;

public class Cats extends Animals{

    //дефолтный конструктор

    public Cats() {
        super("No name","No color",0);
        setType("Cat");
    }

    //конструктор с параметрами

    public Cats (String name, String color, int age){
        super(name, color, age);
        setType("Cat");
    }

    //методы

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
