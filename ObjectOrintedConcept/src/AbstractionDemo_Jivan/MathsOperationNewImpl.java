package AbstractionDemo_Jivan;

public class MathsOperationNewImpl implements MathsOperation{

	@Override
	public int doAddition(int a, int b) {
		int r = a + b;
		return r ;
	}

	@Override
	public int doSubstraction(int a, int b) {
		int r;
		if(a >= b) {
			r = a - b;
		}else {
			r = 0;
		}
		return r;
	}

	
}
