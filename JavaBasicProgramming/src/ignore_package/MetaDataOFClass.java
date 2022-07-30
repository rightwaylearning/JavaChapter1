package ignore_package;

import java.lang.reflect.Method;

class Hello{
	void showMatch() {}
	void test() {}
	void oneDay() {}
	void t20() {}
}

public class MetaDataOFClass {

	public static void main(String[] args) {

		String s = new String("Good");
		Class cls = s.getClass();

		Method[] arr = cls.getMethods();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		System.out.println("====================");
		
		Hello h = new Hello();
		Class<Hello>  foo=(Class<Hello>) h.getClass();
		
		Method[] arr1=foo.getMethods();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i].getName());
		}
		
		
	}
}
