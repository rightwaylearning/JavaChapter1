package Damini;

import java.util.Scanner;

public class primeNumbertakeuser {

	public static void main(String[] args) {
		int num,b,c;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		
		 num=s.nextInt();
		 b=1;
		 c=0;
		 
		 while(b<=num)
		 {
			 
			
			 if(num%b==0)
				 
			 {
				 
				 c=c+1;
			 
				 b++;
				 break;
				
			 }
			 if(c==2)
			 {
				
				 System.out.println(num+"number is prime");
			 }
				 else
				 {
				 System.out.println(num+"number is not prime");	 
				 }
		
			 
			 
			 }
		 }
			
		}

	

