package com.shalemworks.ThrowsFinally;

public class Throw {

	public static void main(String[] args) {
        {

            int a=45,b=25,rs;

            try
            {
                if(b-a<=0)        
                    throw(new ArithmeticException("The result is negitive."));
                else
                {
                    rs = a - b;
                    System.out.print("\n\tThe result is : " + rs);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }

            System.out.print("\n\tEnd of program.");
        }
    }
// TODO Auto-generated method stub

}