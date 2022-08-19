package nilam_constructor;

public class Controller {
	public static void main(String[] args) {
//using parameterized constructor

		Student s = new Student("abc", 12, "10th", 'A');
		System.out.println(s.name);
		System.out.println(s.rollNumber);
		System.out.println(s.div);
		System.out.println(s.std);

// using ref.variable

		s.name = "pqr";
		s.rollNumber = 3;
		s.div = "7th";
		s.std = 'D';
		System.out.println(s.name);
		System.out.println(s.rollNumber);
		System.out.println(s.div);
		System.out.println(s.std);

// using setter getter method

		s.setName("ajit");
		s.setRollNumber(2);
		s.setDiv("11th");
		s.setStd('A');
		System.out.println(s.getName());
	}
}