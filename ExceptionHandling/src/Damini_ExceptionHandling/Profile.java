package Damini_ExceptionHandling;

public class Profile {

	String name;
	String mailID;
	int age;
	public Profile(String name, String mailID, int age) {
		super();
		this.name = name;
		this.mailID = mailID;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", mailID=" + mailID + ", age=" + age + "]";
	}
	
}
