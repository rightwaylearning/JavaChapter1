package sahil_assignment;
public class controller {
	private static Double updatePrice;

	public static void main(String[] args) {
		Product [] arr = new Product [5];
		
		arr[0]= new Product ("washing machine",101,25000.00);
		arr[1]= new Product ("refrigerator",102,35000.00);
		arr[2]= new Product ("moblie",103,45000.00);
		arr[3]= new Product ("Fan",104,2500.00);
		arr[4]= new Product ("T.V",105,65000.00);
		
	
		Showditel.show(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getPorductPrice()  <= 90000.0) {
				updateSalary(i, arr,15.0);
		
			}
		}
		
         System.out.println("---------------------------------------");
         System.out.println("ganesh chaturthi offer 15% discount");
         System.out.println("**********************");
		 Showditel.show(arr);

	}

	static void updateSalary(int index, Product[] arr, double percentage) {
		double updatePrice = arr[index].getPorductPrice() - (arr[index].getPorductPrice() * (percentage / 100));
		
		arr[index].setPorductPrice(updatePrice);

	}
}
