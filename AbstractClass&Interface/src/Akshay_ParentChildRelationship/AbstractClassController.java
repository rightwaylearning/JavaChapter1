package Akshay_ParentChildRelationship;

import Akshay_ParentChildRelationship.Dog.Cow;

abstract class AbstractClassController {
	
	public static void main(String[] args) {
		
		Dog D = new Dog ();
		Lion L = new Lion ();
		Cow C1 = new Cow ();
		
		D.sound();
		L.sound();
		C1.sound();
	}
}
