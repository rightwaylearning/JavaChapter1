package sahil_setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student{
	int a;
	int b;
	public Student(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + "]";
	}
	
}

public class HashSetDuplicateObjectDemo {
public static void main(String[] args) {
	HashSet<Integer> arr = new HashSet<>();
	
	System.out.println(arr.add(10));
	System.out.println(arr.add(20));
	System.out.println(arr.add(30));
	System.out.println(arr.add(40));
	System.out.println(arr.add(20));
	System.out.println(arr.add(40));
	System.out.println(arr.add(30));
	System.out.println(arr.add(10));
	
	System.out.println(arr.size());
	//------------------------------------------
	Set<String> name = new HashSet<>();
	name.add("sahil");
	name.add("akshya");
    name.add("sahil");
    name.add("akshya");
   
    System.out.println(name);
    //-------------------------------------------
    LinkedHashSet<Integer> num = new LinkedHashSet<>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(4);
	num.add(1);
	num.add(5);    
	
	System.out.println(num);
	
	int[]arr1 = {10,20,25,35,45,96,85,74,96,35};
	LinkedHashSet<Integer> number = new LinkedHashSet<>();
	LinkedHashSet<Integer> dublicet = new LinkedHashSet<>();
	for (int i : arr1) {
		boolean flag = number.add(i);
		
		if(flag == false) {
			dublicet.add(i);
		}
	}
	System.out.println(number);
	System.out.println(dublicet);

    
}
}
