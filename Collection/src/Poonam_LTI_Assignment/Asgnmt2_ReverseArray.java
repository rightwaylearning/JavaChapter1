package Poonam_LTI_Assignment;

public class Asgnmt2_ReverseArray {
	
	public static void main(String[] args) {
		
		int[] n= {10,200,30,400,50,600};		
		int startIndex = 0;
		int endIndex = 0;
		int temp;
		System.out.println("Array Length = " +n.length);
		
		for (int i = 0; i < n.length/2; i++) {
			startIndex = i;
			endIndex = (n.length-1) -i;
			if(startIndex>= endIndex) {
				break;
			}else
			{				
				 temp = n[startIndex];
				n[startIndex] = n[endIndex];
				n[endIndex] = temp;
				System.out.println(temp);	
			}
			//System.out.println(temp);	
		}
		//System.out.println(endIndex);	
	}
	

}
