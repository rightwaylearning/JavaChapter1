package MapExamples_Jivan;

import java.util.HashMap;
  
public class WordCount {

	public static void main(String[] args) {

		String str = "Hii hello hi how are you are you fine";

		String[] arr = str.split(" ");

		HashMap<String, Integer> map = new HashMap<>();

		for (String word : arr) {
			System.out.println(word);
		}

	}

}
