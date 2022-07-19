package return_type_examples;

public class Demo {

	int doSum(int a, int b) {
		int sum  = a +b;
		return sum;
	}
	
	float doDivision(float n, float d ) {
		float result = n/d;
		return result;
	}
	
	Student getObject() {
		Student s = new Student();
		s.name = "Madi";
		s.rollNumber = 23;
		return s;
	}
}
