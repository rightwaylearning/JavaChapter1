package ignore_package;

class Student{
	
	int a;
	int b;
	
	@Override
	public int hashCode() {
		return 100;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student obj1 = (Student)obj;
			if(this.a == obj1.a && this.b == obj1.b) {
				return true;
			}
		}
		return false;
		
	}
}

public class Test {

	public static void main(String[] args) {
		Student t = new Student();
		
		Student t1 = new Student();
		
		System.out.println(t.equals(t1));
		
	}
}
