package AbstractionDemo_Jivan;

public class Controller {
	
	public static void main(String[] args) {
		
		MathsOperation o1 = Utility.getObject();
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		int r1 = o1.doAddition(10, 20);
		int r2 = o1.doSubstraction(2, 50);
		
		System.out.println(r1);
		System.out.println(r2);
	
	}

}
