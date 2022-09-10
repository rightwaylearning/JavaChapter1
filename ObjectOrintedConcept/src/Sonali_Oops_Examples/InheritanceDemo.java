package Sonali_Oops_Examples;

class Loan {
	void KYCDoc() {
		System.out.println("I am KYC document method");
	}
}

class HomeLoan extends Loan {
	void HomeLoan() {
		System.out.println("HomeLoan documents method");
	}
}

class CarLoan extends Loan {
	void CarLoan() {
		System.out.println("CarLoan method");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		HomeLoan h = new HomeLoan();
		h.HomeLoan();
		h.KYCDoc();

		CarLoan c = new CarLoan();
		c.CarLoan();
		c.KYCDoc();

		Loan l = new Loan();
		l.KYCDoc();

	}

}
