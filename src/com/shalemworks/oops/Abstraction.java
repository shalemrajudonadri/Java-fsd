package com.shalemworks.oops;

abstract class Abstraction {
    private String name;
 
    public Abstraction(String name) { this.name = name; }
 
    public abstract void makeSound();
 
    public String getName() { return name; }
}
class Cat extends Abstraction {
    public Cat(String name) { super(name); }
 
    public void makeSound()
    {
        System.out.println(getName() + " meows");
    }
}
class Dog extends Abstraction {
    public Dog(String name) { super(name); }
 
    public void makeSound()
    {
        System.out.println(getName() + " barks");
    }
}