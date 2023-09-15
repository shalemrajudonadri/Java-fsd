package com.shalemworks.oops;

public class MainMethodd {
	
    // Main Function
    public static void main(String[] args)
    {
    	Abstraction myDog = new Dog("Buddy");
    	Abstraction myCat = new Cat("Fluffy");
 
        myDog.makeSound();
        myCat.makeSound();
    }
}