package com.shalemworks.oops;

public class Main {
	public static void main(String[] args) {
		
	    // create an object of the subclass
	   College cv=new College();
     
	    // access protected field and method
	    // using the object of subclass
	   cv.name = "jhon";
	   cv.display();

	   cv.getInfo();
	  }
}
