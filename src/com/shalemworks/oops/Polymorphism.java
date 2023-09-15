package com.shalemworks.oops;

public class Polymorphism {
	 public int sub(int x, int y) 
	    { 
	        return (x - y); 
	    } 
	    public int sub(int x, int y, int z) 
	    { 
	        return (x - y - z); 
	    } 
	    public double sub(double x, double y) 
	    { 
	        return (x - y); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Polymorphism s = new Polymorphism(); 
	        System.out.println(s.sub(20, 10)); 
	        System.out.println(s.sub(10, 20, 30)); 
	        System.out.println(s.sub(10.5, 20.5)); 
	    } 

}
