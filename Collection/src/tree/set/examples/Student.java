package tree.set.examples;

public class Student implements Comparable{
  
	private String name;
	private Double percentage;
	
	public Student(String name,Double percentage) {
		this.name = name;
		this.percentage = percentage;
	}
	
	public Student() {}

	@Override
	public String toString() {
		return " [" + name + ", " + percentage + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(this.name.equals(s.name) && this.percentage.equals(s.percentage)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.percentage.hashCode();
	}
	
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
	//	return this.percentage.compareTo(s.percentage);
		if(this.percentage < s.percentage) {
			return -1;
		}else if(this.percentage > s.percentage) {
			return 1;
		}else {
			
			return 0;//this.name.compareTo(s.name);
		}
		
	//	return this.percentage < s.percentage? -1:this.percentage > s.percentage?1:0;     
		
	}
	
}
