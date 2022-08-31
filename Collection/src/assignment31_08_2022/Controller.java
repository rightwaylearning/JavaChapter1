package assignment31_08_2022;

public class Controller {

	public static void main(String[] args) {

		Employee[] arr = new Employee[5];

		arr[0] = new Employee("A", 23, 34500.00);
		arr[1] = new Employee("B", 24, 24500.00);
		arr[2] = new Employee("C", 25, 41500.00);
		arr[3] = new Employee("D", 26, 38500.00);
		arr[4] = new Employee("E", 27, 54500.00);

		ShowList.show(arr);

		// 25000 < 10% ; 25k or 40k >> 5% ; 40k >> 2%

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getEmployeeSalary() <= 25000.0) {
				updateSalary(i, arr,10.0);
			} else if (arr[i].getEmployeeSalary() > 25000.00 && arr[i].getEmployeeSalary() <= 40000.00) {
				updateSalary(i, arr,5.0);
			} else {
				updateSalary(i, arr,2.0);
			}
		}
		
         System.out.println("==============");
		 ShowList.show(arr);

	}

	static void updateSalary(int index, Employee[] arr, double percentage) {
		double updatedSalary = arr[index].getEmployeeSalary() + (arr[index].getEmployeeSalary() * (percentage / 100));
		arr[index].setEmployeeSalary(updatedSalary);
	}
}
