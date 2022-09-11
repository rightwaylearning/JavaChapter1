package damini_abstraction;

public class Controller {

	public static void main(String[] args) {
		MathsOperation mp=Utility. getobject();
		
		int r=mp.doAddition(20, 30);
		int r1=mp.doSubstraction(30, 10);
		
		System.out.println(r);
		System.out.println(r1);
	}
}
