package ru.example;

public class Animals {
    private String type; //тип животного
    private String name; //имя животного
    private String color; //окрас животного
    private int age; //возраст животного

    //конструктор

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    //геттеры и сеттеры

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //методы

    public String voice(){
        return "unknown";
    }

    public String ration(){
        return "unknown";
    }

    public String skill(){
        return "unknown";
    }

    public boolean CanMove(){
        return false;
    }

    public void aboutMe(){
        System.out.println("Type of Animal: "+ getType());
        System.out.println("The name: "+ getName());
        System.out.println("Have color: "+ getColor());
        System.out.println("Can move : "+ CanMove());
        System.out.println("Years old: "+ getAge());
        System.out.println("Like eating: "+ ration());
        System.out.println("Have skill: "+ skill());
        System.out.println("What he says: "+ voice());
        System.out.println();
    }
}
