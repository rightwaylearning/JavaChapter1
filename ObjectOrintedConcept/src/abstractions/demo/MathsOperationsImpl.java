package abstractions.demo;

public class MathsOperationsImpl implements MathsOperations {

	@Override
	public int doAddition(int a, int b) {
        int r = a + b;
		return r;
	}
	
	
	@Override
	public int doSubstraction(int a, int b) {
		 int r = a - b;
		 return r;
	}

	
}
