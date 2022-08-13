package ProgramsOnNumbers;

public class TablesFrom1ToN {

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
}
