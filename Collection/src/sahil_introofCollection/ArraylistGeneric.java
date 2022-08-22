package sahil_introofCollection;

import java.util.ArrayList;

public class ArraylistGeneric {
  public static void main(String[] args) {
	  
	ArrayList<String> a = new 	ArrayList<String> ();
	a.add("sahil");
	a.add("akshay");
	a.add("rahul");
	a.add("shubham");
	a.add("good moring india");
	System.out.println(a.get(2));
	for (String s:a) {
		System.out.println(s);
		System.out.println(a.size());
	}
	System.out.println("==============================");
	ArrayList<String> a1 = new 	ArrayList<String> ();
	a1.add("dharmendra");
	a1.add("sanjay");
	a1.add("pardip");
	for (String s:a1) {
		System.out.println(s);
	}
   a.addAll(a1);
   for(String s:a) {
	   System.out.println(s);
   }
   System.out.println("=======================");
 System.out.println(a.size());
System.out.println("========================");	
    int []s = new int[7];
    s[0]= 10;
    s[1]=20;
    s[2]=30;
    s[3]=40;
    s[4]=50;
    s[5]=60;
    s[6]=70;
    
    for (int i:s) {
    	System.out.println(i);
    }
    
    System.out.println("///////////////////////////////");
    
	for (int b :s) {
		System.out.println(b);
	}
   System.out.println(s.length);
   

}
}
