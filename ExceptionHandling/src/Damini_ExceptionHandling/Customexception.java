package Damini_ExceptionHandling;


public class Customexception {

	public static void main(String[] args) {
		
	
	Profile a1=new Profile("damini","damini@123",29);
	Profile a2=new Profile("durva","durva@123",4);
	Profile a3=new Profile("devsya","devsya@123",5);
	
	StorageProfile sp=new StorageProfile();
	sp.saveprofile(a1);
	sp.saveprofile(a2);
	sp.saveprofile(a3);
	
	for(Profile p: StorageProfile.list)
	{
		System.out.println(p);
	}
	
}
}
