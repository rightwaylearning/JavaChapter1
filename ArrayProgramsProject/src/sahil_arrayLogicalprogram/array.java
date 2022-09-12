package sahil_arrayLogicalprogram;

import java.util.ArrayList;

public class array {
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	
	ArrayList arr1 = new ArrayList();
	arr1.add("sahil");
	arr1.add("nike");
	 arr.addAll(arr1);
	 System.out.println(arr);
	  arr.add(30);
	  System.out.println(arr);
	 
	
}

}

