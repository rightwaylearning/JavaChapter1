package introduction_pack;

public class ShowArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};  // 5  >> 0-4
		
		//System.out.println(arr[0]);
		
		//------------------------------
		// using while loop
		System.out.println(">>>>>>> using while loop");
		 int index =0 ;
		 while(index < arr.length) {
			 System.out.println(arr[index]);
			 index++;
		 }
		
		System.out.println(">>>>>>>>using for loop");
		 
		 for(int i =0 ; i < arr.length ; i++) {
			 System.out.println(arr[i]);
		 }
		 
	   System.out.println(">>>>> foreEch >>>>>");	 
	   // this control flow we can use with array & collection only 
	   for(int item:arr) {
		   System.out.println(item);
	   }
	}
}
