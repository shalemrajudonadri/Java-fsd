package com.shalemworks.ThrowsFinally;

public class Throws {
	void Division() throws ArithmeticException
    {
    int a=45,b=0,rs;
     rs = a / b;
    System.out.print("\n\tThe result is : " + rs);
  }
 public static void main(String[] args)
{
   Throws T = new Throws();
     try
    {
       
        	
        	T.Division();//throws an exception
        
    }
    catch(ArithmeticException Ex)//catching the exception
    {
        System.out.print("\n\tError : " + Ex.getMessage());
    }
    System.out.print("\n\tEnd of program.");
}
}