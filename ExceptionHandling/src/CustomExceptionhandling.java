public class CustomExceptionhandling {

	public static void main(String[] args) {

		Profile p1 = new Profile("Mahesh", "sachin16@gmail.com", 22);
		Profile p2 = new Profile("sahil", "sachin16@gmail.com", 17);
		Profile p3 = new Profile("Ashish", "sachin17@gmail.com", 28);

		ProfileStorage s = new ProfileStorage();
		s.saveProfile(p1);
		s.saveProfile(p2);
		s.saveProfile(p3);

		for (Profile p : ProfileStorage.list) {
			System.out.println(p);
		}
	}
}
