 package abstractions.demo;

public class Utility {

	public static MathsOperations getObject() {
		
		MathsOperations obj = new MathsOperationsUnderConstrcution(); // case 3
		return obj;
				
	}
}
