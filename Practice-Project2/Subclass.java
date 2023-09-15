package com.shalemworks.accessModifiers;

public class Subclass extends Acess_Modifier {
	public void accessFieldsAndMethods(char[] PrivateField) {
		// Accessing fields and methods from the superclass

		   // Public fields and methods are accessible everywhere
		   System.out.println(publicField);
		   publicMethod();

		   // Protected fields and methods are accessible in subclasses
		   System.out.println(protectedField);
		   protectedMethod();

		   // Package-private fields and methods are accessible in the same package
		   System.out.println(packagePrivateField);
		   packagePrivateMethod();

		   // Private fields and methods are not accessible in subclasses
		   //System.out.println(privateField); // This would result in a compilation error
		   //privateMethod(); // This would result in a compilation error
	}
}

