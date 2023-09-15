package com.shalemworks.daimondDemo;
interface First 
{  
    default void show() 
    { 
        System.out.println("First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Second"); 
    } 
}  
public class DaimondDemo implements First ,Second{
	  public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	DaimondDemo ob = new DaimondDemo(); 
	        ob.show(); 
	    } 
	}

