package ru.example;

public class Animals {
    private String type;
    private String name;
    private String color;
    private int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

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


    public String voice(){
        return "unknown";
    }

    public String ration(){
        return "unknown";
    }

    public String skill(){
        return "unknown";
    }

    public boolean canMove(){
        return false;
    }

    public void aboutMe(){
        System.out.println("Type of Animal: "+ getType());
        System.out.println("The name: "+ getName());
        System.out.println("Have color: "+ getColor());
        System.out.println("Can move : "+ canMove());
        System.out.println("Years old: "+ getAge());
        System.out.println("Like eating: "+ ration());
        System.out.println("Have skill: "+ skill());
        System.out.println("What he says: "+ voice());
        System.out.println();
    }
}
