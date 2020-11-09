package ru.example;

public class Dogs extends Animals {

    //дефолтный конструктор

    public Dogs() {
        super("No name","No color",0);
        setType("Dog");
    }

    //конструктор с параметрами

    public Dogs(String name, String color, int age) {
        super(name, color, age);
        setType("Dog");
    }

    //методы

    @Override
    public String voice() {
        return "Gav-Gav";
    }
    @Override
    public String ration() {
        return "Bones";
    }
    @Override
    public String skill() {
        return "Swim";
    }
    @Override
    public boolean canMove() {
        return true;
    }
}
