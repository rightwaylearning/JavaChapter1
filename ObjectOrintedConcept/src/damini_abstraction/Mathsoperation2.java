package damini_abstraction;

public class Mathsoperation2 implements MathsOperation {

	@Override
	public int doAddition(int a, int b) {
		int r=a+b;
		return r;
	}

	@Override
	public int doSubstraction(int a, int b) {
	    int r=a-b;
		return r;
	}
	
	

}
