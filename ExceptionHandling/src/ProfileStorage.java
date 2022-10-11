import java.util.ArrayList;
import java.util.List;

public class ProfileStorage  {

	static  List<Profile> list = new ArrayList();
	
	void saveProfile(Profile p)  {
		try {
		if(p.age < 18) {
			throw new AgeLimitEception();
		}else {
			list.add(p);
		}
		}catch (AgeLimitEception e) {
			System.out.println(e);
		}
	}
}
