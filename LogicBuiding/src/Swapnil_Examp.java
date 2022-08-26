import java.util.ArrayList;

public class Swapnil_Examp {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.stream().forEach(e -> System.out.println(e));
	}
}
