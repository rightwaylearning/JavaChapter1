package Sahil_array;

public class controller {
	public static void main(String[] args) {
		college c = new college();
		c.rollNumber = 101;
		c.Name = "sahil";
		c.std = "12 th";
		
		c.add = new Address ();
		
		c.add.poltNo = 64;
		c.add.area = "sankalp nagar";
		c.add.cityName = "mumbai";
		c.add.pinNumber = 44003;
		
		c.subject = new String [5];
	    c.subject[0] = "abcd";
	    c.subject[1]= "fggv";
	    c.subject[2]= "brbr";
	    c.subject[3]="vfeg";
	    c.subject[4]="wdergg";
	    
	    showData Show = new showData();
	    Show.displayInfo(c);
	    
	    		
	}

}
