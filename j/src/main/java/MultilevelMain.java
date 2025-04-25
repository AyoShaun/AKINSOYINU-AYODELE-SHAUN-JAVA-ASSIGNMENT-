/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayo Shaun
 */
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Renamed to avoid conflict with existing Dog class
class Dog2 extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog2 {
    public void playFetch() {
        System.out.println("Labrador is playing Fetch");
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Labrador myLab = new Labrador();
        myLab.eat();
        myLab.bark();
        myLab.playFetch();
    }
}