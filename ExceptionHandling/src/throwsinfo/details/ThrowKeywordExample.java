package throwsinfo.details;

public class ThrowKeywordExample {

	public static void main(String[] args)  {
		int a = 100;
		int b = 0;
		try {
			if(a == 0 || b ==0) {
				throw new DontDoMultiplicationWithZero();
			}
			int mul = a * b;
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class DontDoMultiplicationWithZero extends Exception{
	DontDoMultiplicationWithZero(){
		System.out.println("please boss dont do multiplication with zero no use!!!");
	}
}