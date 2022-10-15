package Sonali_Java_Lang_Programs;
class person{
	String name;
	Integer Id;
	public person(String name, Integer id) {
		super();
		this.name = name;
		this.Id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) 
			return true; 
			if(obj instanceof person) 
			{
			person p2=(person)obj; 
			if(name.equals(p2.name)&&Id==p2.Id) 
			return true; 
			else 
			return false; 
			}
	
	
}
public class EqualMethodDemo {
	public static void main(String[] args) {
		
			person p1=new person("vijayabhaskar",101); 
			Person p2=new Person("vijayabhaskar",101); 
			Integer i=new Integer(102); 
			System.out.println(p1.equals(p2)); 
			System.out.println(p1.equals(i)); 
			}}
	}
}
	

}
