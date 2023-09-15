package com.shalemworks.typeCast;

public class TypeCasting {

	public static void main(String[] args) {
		
		//implicit conversion 
		System.out.println("Implicit Type Casting");
		byte z= 10;
		short s=z;
		byte abc= (byte)(s);
		char a='A';
		int b=a;
		float c=a;
		long d=a;
		double e=a;
		double x=45.5;
		int y=(int)x;
		System.out.println("implicit conversion from byte to short: " + s);
		
		System.out.println("explicit  conversion from short to byte:" + abc);

		System.out.println("Value of a: " + a);

		System.out.println("Value of b: " + b);

		System.out.println("Value of c: " + c);

		System.out.println("Value of d: " + d);

		System.out.println("Value of e: " + e);

		System.out.println("\n");

		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}

