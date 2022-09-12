package AbstractionDemo_Jivan;

public class Utility {
	
	public static MathsOperation getObject() {
		
		MathsOperation obj = new MathsOperationUnderConstruction();
		return obj;
	}

}
