package IntroductionPack_Jivan;

public class CountNumberOfElementsInArray {
	
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int r = countElement(arr1);
		System.out.println(r);
		//or System.out.println(countElement(arr1));
		
		int[] arr2 = {};
		System.out.println(countElement(arr2));
		
		int[] arr3 = null;
		int r1 = countElement(arr3);
		if(r1 == -1) {
			System.out.println("Given array object is null");
		}else {
			System.out.println(r1);
		}
		System.out.println(countElement(arr3));
	}
	
	static int countElement(int[] arr) {
		int cnt = 0;
		if (arr != null) {
		for(int i = 0; i < arr.length; i++) {
			cnt++;
		}
		return cnt;
		}else {
			return -1;
		}
	}

}
