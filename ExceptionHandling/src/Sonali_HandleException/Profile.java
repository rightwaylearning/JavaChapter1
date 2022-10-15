package Sonali_HandleException;

public class Profile {
	String Name;
	String Email;
	Integer age;
	public Profile(String name, String email, Integer age) {
		super();
		this.Name = name;
		this.Email = email;
		this.age = age;
	}
	 Profile(){
		 
	 }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Profile [Name=" + Name + ", Email=" + Email + ", age=" + age + "]";
	}

}
