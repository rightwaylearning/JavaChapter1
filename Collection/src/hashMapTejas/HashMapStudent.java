package hashMapTejas;
import java.util.*;

public class HashMapStudent 
{

	public static void main(String[] args) 
	{
		ArrayList <StudentData> sd =new ArrayList<StudentData>();
		sd.add(new StudentData("A",10));
		sd.add(new StudentData("B",20));
		sd.add(new StudentData("C",20));
		
		sd.add(new StudentData("A",30));
		sd.add(new StudentData("B",40));
		sd.add(new StudentData("C",50));
		
		 // count the frequency of the word "code"
        System.out.println("The frequency of the Student A, 10 is: "+ Collections.frequency(sd, new StudentData("A", 10))); 
		

	}

}
