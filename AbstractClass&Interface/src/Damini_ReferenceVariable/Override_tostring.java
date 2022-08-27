package Damini_ReferenceVariable;

class cloth
{
	int clothnumber;
	String brand;
	char size;
	
	
	
	public cloth(int clothnumber, String brand, char size) {
		super();
		this.clothnumber = clothnumber;
		this.brand = brand;
		this.size = size;
	}



	@Override
	public String toString() {
		return " ["+ clothnumber + "," + brand + "," + size + "]";
	}
	
	}
public class Override_tostring {

	public static void main(String[] args) {
		cloth c=new cloth(25,"global desi",'M');
		System.out.println(c);
		
	}
}
