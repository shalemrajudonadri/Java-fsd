package com.shalemworks.accessModifiers;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acess_Modifier am= new Acess_Modifier();
	     am.publicMethod();
	     System.out.println(am.publicField);

	     Subclass subclass = new Subclass();
	     subclass.accessFieldsAndMethods(null);
	 }
		

}
