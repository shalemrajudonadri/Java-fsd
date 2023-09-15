package com.shalemworks.accessModifiers;

public class Acess_Modifier {
	 // Public field accessible from anywhere
	 public int publicField = 10;

	 // Private field accessible only within this class
	 private int privateField = 20;

	 // Protected field accessible within this class and its subclasses
	 protected int protectedField = 30;

	 // Package-private field (no modifier) accessible within the same package
	 int packagePrivateField = 40;

	 // Public method accessible from anywhere
	 public void publicMethod() {
	     System.out.println("Public method called");
	 }

	 // Private method accessible only within this class
	 private void privateMethod() {
	     System.out.println("Private method called");
	 }

	 // Protected method accessible within this class and its subclasses
	 protected void protectedMethod() {
	     System.out.println("Protected method called");
	 }

	 // Package-private method (no modifier) accessible within the same package
	      void packagePrivateMethod() {
	          System.out.println("Package-private method called");
	 }

}
