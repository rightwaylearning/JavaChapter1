package top.ten.exception;

public class ArrayIndexOOBEDemo {

	public static void main(String[] args) {
		int index = 1;
		if (index >= 0 && index < args.length) {
			System.out.println(args[index]);
		}
		System.out.println("done...");
		// ---------------------------------
		int[] arr = null;
		if (arr != null) {

			for (int i = 0; i <= arr.length; i++) {
				if (i >= 0 && i < arr.length) {
					System.out.println(arr[i]);
				}
			}
		}else {
			throw new ArrayIndexOutOfBoundsException("please chcek your arr , it's pinting to null object please take care");
		}
	}
	

}
