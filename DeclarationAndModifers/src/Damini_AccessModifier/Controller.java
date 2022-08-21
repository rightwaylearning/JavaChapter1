package Damini_AccessModifier;

public class Controller {
	public static void main(String[] args) {
		
		Test t =new Test();
		t.setNo(34);
		t.setName("abs");
	    
		System.out.println(t.getNo());
	    
	    System.out.println(t.getName());
	}

}
