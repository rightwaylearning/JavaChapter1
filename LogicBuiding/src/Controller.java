
public class Controller {

	public static void main(String[] args) throws Exception {
		
		
		
		Object t1  =Class.forName(args[0]).newInstance();
		
		if(t1 instanceof Test) {
			Test t = (Test)t1;
			t.m1();
		}
		
		if(t1 instanceof Sample) {
			Sample s =(Sample)t1;
			s.m2();
		}
		
	}
}
