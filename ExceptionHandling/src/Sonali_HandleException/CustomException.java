package Sonali_HandleException;

public class CustomException {

	public static void main(String[] args) {
		Profile p1 = new Profile("Sonali", "Sonaligalande24@gmail.com", 15);
		Profile p2 = new Profile("Sonal", "ItsSonal50@gmail.com", 22);
		Profile p3 = new Profile("Sona", "Sonali100@gmail.com", 20);

		ProfileStorage s = new ProfileStorage();
		s.SaveProfile(p1);
		s.SaveProfile(p2);
		s.SaveProfile(p3);

		for (Profile p : ProfileStorage.list) {
			System.out.println(p);
		}

	}

}
