package Nilam;

public class SumOfGivenNumber {
	public static void main(String[] args) {
		
	
	int num = 34536;
	int sum =0;
	
	
	while(num>0) {
		int r= num%10;
		sum =sum+r;
		num =num/10;
		
	}
System.out.println(sum);
}
}