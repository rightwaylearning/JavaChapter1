package nilam_arrayexample;

public class ArrayObject {
	public static void main(String[]arg) {
		
      Student[] arr = new Student[5];
      
      arr[0] =new Student();
                  arr[0].name="advik";
                  arr[0].rollNumber=2;
                  
      arr[0].addr= new Address ();
      
                 arr[0].addr.cityname="pune";
                 arr[0].addr.pinnumber=1234;
                  
                  System.out.println(arr[0].name);
                  System.out.println(arr[0].rollNumber);
                  
                  System.out.println(arr[0].addr.cityname);
                  System.out.println( arr[0].addr.pinnumber);
	
	}

}
