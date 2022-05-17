package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Horse implements AnimalAble{

    @Value("${horse.name}")
    private String name;
    @Value("${horse.age}")
    private int age;
    @Value("${horse.breed}")
    private String breed;
    @Value("${horse.color}")
    private String color;

    public Horse() {
    }

    public Horse(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }
    @Override
    public void animalPlus() {
        System.out.println("animal plus");
    }

    @Override
    public void animalMinus() {
        System.out.println("animal minus");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
