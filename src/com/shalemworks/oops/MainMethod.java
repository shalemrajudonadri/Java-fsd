package com.shalemworks.oops;

public class MainMethod {
	  public static void main (String[] args)  
	    { 
	        Encapsulation obj = new Encapsulation(); 
	        obj.setName("Jhon"); 
	        obj.setAge(19); 
	        obj.setRoll(51); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getRoll());      
	    } 

}
