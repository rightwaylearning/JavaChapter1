
public class Profile {
	String name;
	String mailId;
	int age;

	public Profile(String name, String mailId, int age) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", mailId=" + mailId + ", age=" + age + "]";
	}
	
	

}
