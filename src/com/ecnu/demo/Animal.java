package com.ecnu.demo;

public class Animal {
    String Breed;
    String Name;
    Integer age;

    Animal(String Name) {
        this.Name = Name;
    }
    void eat() {
        System.out.println("I am com.ecnu.demo.Animal!");
    }
    void sleep() {
        System.out.println("I wanna Sleep!");
    }
}

class Dog extends Animal {
    Dog(String Name) {
        super(Name);
    }

    void eat() {
        System.out.println("I am a com.ecnu.demo.Dog, my Name is " + Name);
    }
}

class Cat extends Animal {
    Cat(String Name) {
        super(Name);
    }

    @Override

    void eat() {
        System.out.println("I am a com.ecnu.demo.Cat, my Name is " + Name);
    }
}
