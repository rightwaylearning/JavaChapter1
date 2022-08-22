package Kalpesh;

import ProgramsOnNumbers.TablesFrom1ToN;

public class NewProgram {
	public static void main(String[] args) {
		int t = 1;

		while (t <= 20) {
			TablesFrom1ToN.printTable(t);
			t++;
		}

	}


	

	public static void printTable(int table) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i * table);
			i++;
		}
		System.out.println(">>>>>>>>>>>>>>>>>");
	}



{
	{
		

int num = 675436;
int copyOfNum = num;
int sum = 0;

while (num > 0) {
	int r = num % 10;
	sum = sum + r;
	num = num / 10;
}

System.out.println(" given number "+copyOfNum+" digit sum is = " + sum);
}

	
	
}
}
