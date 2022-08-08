package MainMethodExample;

public class Controller {

	public static  void main(String... data) {  
		
		VarArgMethod m = new VarArgMethod();
		
		m.sum();
		m.sum(10,20);
		m.sum(40,50,90,78,90,56,78);
	}
}
