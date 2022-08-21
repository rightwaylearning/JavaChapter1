package Akshay_Programs_on_Number;

public class TableFromNum {

	public static void main(String[] args) {

		int a = 1;

		while (a <= 20) {

			TableFromNum.printTable(a);
			a++;
			System.out.println("------------------------------------------");
		}
		
	}

	private static void printTable(int akshay) {

		int t = 1;

		while (t <= 10) {

			System.out.print(t * akshay + " ");
			t++;

		}

	}
}
