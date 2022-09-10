package Array_List_Examples_Jivan;

public class Search_Number_From_Array {
	
	public static void main(String[] args) {
		// here we are going to use linear search techniques
		int[] arr = {10, 20, 30, 40, 50};   // size 5 >>> valid index = 0 to 4
		
		int num = 20;
		
		int size = arr.length;
		int index = 0;
		boolean flag = false;
		
		while(index < size) {
			if(num == arr[index]) {
				flag = true;
				break;
			//}else {
			//	System.out.println("Sorry! Boss number is not in given array");
			}
			index++;
		}
		
		if(flag) {
			System.out.println("Number if found in given array");
		}else {
			System.out.println("Given number is not found in array");
		}

	}
}