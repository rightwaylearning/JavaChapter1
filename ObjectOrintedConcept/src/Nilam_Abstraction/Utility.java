package Nilam_Abstraction;

public class Utility {
	
	public static MathOperation getobject() {
		MathOperation Mop = new MathOpNewImpl();
		return  Mop;
		
	}

}
