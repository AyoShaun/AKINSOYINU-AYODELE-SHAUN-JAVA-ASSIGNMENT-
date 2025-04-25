/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayo Shaun
 */
class Animal2 {
    public void eat() {
       System.out.println("Animal is eating");
          }
   }
   
   public class Dog extends Animal2 {
       public void bark() {
              System.out.println("Dog is barking");
       }
   
       public static void main(String[] args) {
           Dog myDog = new Dog();
           myDog.eat();
           myDog.bark();
       }
   }