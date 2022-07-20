package main_data_type_examples;

public class TypeConvertion {

	
	public static void main(String[] args) {
		
		byte b = 10;
		short s = b;  // type casting >> compiler
		
		short s1 = 10;
		byte b1 = s1;  // as per size calculation compiler given error
		
		long l = 3276L;
		int i = l;  // same type missmatch
	}
}
