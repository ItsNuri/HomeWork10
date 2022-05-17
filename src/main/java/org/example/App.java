package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Horse horse = context.getBean("horse",Horse.class);
        System.out.println("Horse name: " + horse.getName());
        System.out.println("Horse age: " + horse.getAge());
        System.out.println("Horse breed: " + horse.getBreed());
        System.out.println("Horse color: " + horse.getColor());
        horse.animalMinus();
        horse.animalPlus();
        Person person = context.getBean("person",Person.class);
        System.out.println("Person name: " + person.getName());
        System.out.println("Person age: " + person.getAge());
        System.out.println("Person horse: " + person.getHorse());



    }
}
