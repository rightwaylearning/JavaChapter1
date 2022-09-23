package test.sample;

import java.util.ArrayList;

public class ToStringDemo {

	public static void main(String[] args) {
		ToStringDemo t = new ToStringDemo();
		String s = new String("ashok IT");
		System.out.println(s.toString());
		
		System.out.println(t); // t.toString()
		 //  test.sample.ToStringDemo@123AB67DF
		 //  test.sample.ToStringDemo@515f550a
		// test.sample.ToStringDemo@1
		ArrayList l = new ArrayList<>();
		System.out.println(l.toString());
	}
	
	
	
	@Override
	public String toString() {
	
		return "Hello Good morning";
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}

// why we have to override toString method of object class;
