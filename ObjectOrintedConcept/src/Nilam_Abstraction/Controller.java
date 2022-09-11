package Nilam_Abstraction;

public class Controller {
	public static void main(String[] args) {

		MathOperation obj = Utility.getobject();
		int r = obj.doAddition(10, 20);
		int result = obj.doSubstraction(2, 10);

		System.out.println(r);
		System.out.println(result);

	}
}
