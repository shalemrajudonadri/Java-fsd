package com.shalemworks.ThrowsFinally;

class customerexception extends Exception 
{ 
    public customerexception(String s) 
    { 
        super(s); 
    } 
} 
public class Customerexception 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new Exception("temp"); 
        } 
        catch (Exception ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}