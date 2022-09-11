package Sonali_collection_All_Example;

public class Minumum_Array {
	
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,2,3,4,5,};
		int Min=arr[0];
		
		for (int n: arr) {
			if(n<Min) {
				Min=n;
			}
			}
		System.out.println(Min);
	}

}
