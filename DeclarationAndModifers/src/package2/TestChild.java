package package2;

import package1.Test;

public class TestChild extends Test {

	void m1() {
		TestChild t = new TestChild();
		 System.out.println(t.rollNumber);
		 
		 Test t1= new Test();
		 System.out.println(t1.rollNumber);
	}
}
