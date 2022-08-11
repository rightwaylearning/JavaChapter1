package Nilam;

public class Nilam_flowControl {

	public static void main(String[] arg) {

		double salary = 25000.00;
		Bank_criteria b = new Bank_criteria();
		if (b.isEmployeeisvalidforsalaryacc(salary)) {

			System.out.println("you can try in HDFC bank");

		} else {
			System.out.println("you can try in SBI bank");
		}
		System.out.println("account is open");

	}
}
