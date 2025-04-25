/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayo Shaun
 */
class Animal3 {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog3 extends Animal3 {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal3 {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

class Labrador2 extends Animal3 {
    public void playFetch() {
        System.out.println("Labrador is playing fetch");
    }
}

public class HRMain {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();

        Labrador myLab = new Labrador();
        myLab.eat();
        myLab.playFetch();
    }
}