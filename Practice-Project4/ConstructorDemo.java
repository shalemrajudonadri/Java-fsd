package com.shalemworks.constructors;

public class ConstructorDemo {
	int id;
	String name;

	public ConstructorDemo() {

		System.out.println("default const");
		System.out.println(this.id);
		System.out.println(this.name);
	}

	public ConstructorDemo(int idd, String namee) {
		super();
		this.id = idd;
		this.name = namee;
	}

	 @Override
	 public String toString() { return "shalem"; }
	 
	public static void main(String[] args) {
		ConstructorDemo t = new ConstructorDemo();
		ConstructorDemo t1 = new ConstructorDemo(1, "Balaji");
		System.out.println(t);
		System.out.println(t1);
	}

}
