package ArrayAssignment3182022;

public class Controller {

	public static void main(String[] args) {

		Employee[] ar = new Employee[5];

		ar[0] = new Employee("A", 24, 23400.00);
		ar[1] = new Employee("B", 25, 26400.00);
		ar[2] = new Employee("C", 26, 27400.00);
		ar[3] = new Employee("D", 27, 29400.00);
		ar[4] = new Employee("E", 28, 40400.00);

		ShowList.show(ar);

		for (int i = 0; i <= ar.length; i++) {
			if (ar[i].getEmpSalary() <= 25000.0) {
				updateSalary(i, ar, 10.0);
			} else if (ar[i].getEmpSalary() > 25000.00 && ar[i].getEmpSalary() <= 40000) {
				updateSalary(i, ar, 5.0);
			} else {
				updateSalary(i, ar, 2.0);
			}
		}
		System.out.println("-----------------");

		ShowList.show(ar);

	}

	static void updateSalary(int index,Employee[] ar,double Per) {
		double updatedsalary=ar[index].getEmpSalary()+(ar[index].getEmpSalary()*(Per/100));
		ar[index].setEmpSalary(updatedsalary);
	}
}
