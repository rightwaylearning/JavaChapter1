package TypesOfVariables;

public class LocalVariable {

	StudentModel m1() {
		
		String s ="abc";
		int a = 100;
		int b = 200;
		
		StudentModel model = new StudentModel();
		model.info = s;
		model.data1 = a;
		model.data2 = b;
		
		return model;
		
	}
	
	
	public static void main(String[] args) {
		
		LocalVariable obj = new LocalVariable();
		StudentModel data =  obj.m1();
		System.out.println(data.info);
		System.out.println(data.data1);
		System.out.println(data.data2);
	}
}
