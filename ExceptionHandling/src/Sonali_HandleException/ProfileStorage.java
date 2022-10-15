package Sonali_HandleException;

import java.util.ArrayList;
import java.util.List;

public class ProfileStorage {

	static List<Profile> list = new ArrayList<>();

	void SaveProfile(Profile p) {
		try {
			if (p.age > 18) {
				new AgeLimitException();
			} else {
				list.add(p);
			}
		} catch (AgeLimitException e) {
			System.out.println(e);
		}
	}

}
