package Sonali_collection_All_Example;

public class Array_Larger {
	
	public static void main(String[] args) {
		
		
		int [] arr = {2,3,4,5,6,8,9,8,6,5};
		int Max = arr[0];
		for ( int i : arr) {
			if(i>Max) {
				Max=i;
			}
		}
		
		int Second_Max=arr[0];
		for (int i : arr) {
			if(i>Second_Max && i !=Max) {
				Second_Max=i;
			}
			}
		
		
		int third_Max=arr[0];
		for(int i :arr) {
			if(i>third_Max && i!=Max && i!= Second_Max) {
				third_Max=i;
			}
		}
			System.out.println(Max);
			System.out.println(Second_Max);
			System.out.println(third_Max);
		}
	}


