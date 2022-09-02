package sahil_collection;

public class example {
	String name;
	int rollnumber;
	
	public example(String name, int rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
	}
	
	public static void main(String[] args) {
		example s = new example ("sahil", 101);
		example s1 = new example ("nikesh", 102);
       System.out.println(s1);
       System.out.println(s1.toString());
       System.out.println(s);
	}

	
	
}
