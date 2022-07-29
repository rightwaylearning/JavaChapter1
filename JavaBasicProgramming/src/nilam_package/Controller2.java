package nilam_package;

public class Controller2 {
	
public static void main(String[]arg) {
	
	Demo2 a = new Demo2();
	int r = a.sqr(10, 10);
	System.out.println(r);
	
	
	Student s =a.object();
	System.out.println(s.Name);
	System.out.println(s.rollNumber);
}

}
