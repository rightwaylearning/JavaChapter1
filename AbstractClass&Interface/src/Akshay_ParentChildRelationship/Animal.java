package Akshay_ParentChildRelationship;

abstract class Animal {

	Animal() {
		System.out.println("All Animal"); // This is Constructor
	}

	public abstract void sound();
}

//-----------------------Class 1----------------------------------------

class Lion extends Animal {

	Lion() { // This is Constructor
		super();
	}

	public void sound() {
		System.out.println("Lion is Road");
	}
}

//---------------------Class 2------------------------------------------

class Dog extends Animal {

	Dog() { // This is Constructor
		super();
	}

	public void sound() {
		System.out.println("Dog is Barking");
	}
<<<<<<< HEAD
}
=======
}	
>>>>>>> 6da216fc68764d962cebc6fc9ec07250849e8732
//---------------------Class 3--------------------------------------------
	
class Cow extends Animal {

		Cow() { // This is Constructor
			super();
		}

		public void sound() {
			System.out.println("Cow is Moo");
		}
	}


