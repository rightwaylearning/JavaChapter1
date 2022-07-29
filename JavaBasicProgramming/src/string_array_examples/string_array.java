package string_array_examples;

public class string_array {

	public static void main(String[] args) {
		
		String[] nameList = new String[5]; // size = 5 valid index 0-4
		
		nameList[0] = "AB";
		nameList[1] = "sachin";
		nameList[2] = "";
		nameList[3] = "";

		ShowList s = new ShowList();
		s.viewList(nameList);
		
	}
}
