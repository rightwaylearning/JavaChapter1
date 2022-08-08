package Akshay_TypesOfVariable;

public class Local_Variable {

	ColorModel Akshay() {

		String q = "Blue";
		int r = 10;
		int t = 15;

		ColorModel Model = new ColorModel();
		Model.info = q;
		Model.data1 = r;
		Model.data2 = t;

		return Model;
	}

	public static void main(String[] args) {

		Local_Variable Sahil = new Local_Variable();
		ColorModel data = Sahil.Akshay();
		System.out.println("Details of the Colour\n");
		System.out.println("Colour Name is = " + data.info);
		System.out.println("Colour Code is = " + data.data1);
		System.out.println("Colour Qty is = " + data.data2);

	}

}
