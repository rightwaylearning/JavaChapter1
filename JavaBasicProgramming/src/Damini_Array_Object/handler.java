package Damini_Array_Object;

public class handler {
	
	public static void main(String[] args) {
		
		Student_12 st=new Student_12();
		
		st.name="damini";
		st.rollnumber=34;
		st.collagename="dfg";
		
		st.addr=new Address();
		
		  st.addr.cityname="ahmedabad";
		  st.addr.pincode=35678;
		  
		  //-------------------------------
		  
		  Address ad=new Address();
		  ad.cityname="Mehsana";
		  ad.pincode=345267;
		  
		 st.addr=ad;
		  
		  System.out.println(st.name);
		  System.out.println(st.collagename);
		  System.out.println(st.rollnumber);
		  System.out.println(st.addr.cityname);
		  System.out.println(st.addr.pincode);
		  
		  
				
		
	}

}
