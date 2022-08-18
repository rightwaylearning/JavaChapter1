package college_sahil;

public class stundent {
	public String stundentName;
	public int rollNumber;
	static String barnch;
	static String address;
	public String getStundentName() {
		return stundentName;
	}
	public void setStundentName(String stundentName) {
		this.stundentName = stundentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public static String getBarnch() {
		return barnch;
	}
	public static void setBarnch(String barnch) {
		stundent.barnch = barnch;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		stundent.address = address;
	}
          
	
}
