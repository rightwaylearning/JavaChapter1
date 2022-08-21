package ProgramsOnNumbers;

public class FibonacciSeries {

	public static void main(String[] args) {
		int terms = 1;
		
		int first = 0;
		int second = 1;
//		 0 ,1 ,1
		
		while(terms <=10) {
			
			int next = first + second;
			System.out.print(first +" ");
			first = second;
			second = next;
			
			terms++;
		}
	}
}
