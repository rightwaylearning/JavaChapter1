import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WordCountAndFrequency {

	public static void main(String[] args) throws Exception{
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		int wordCount = 0;
		String line = br.readLine();
		while(line != null) {
			String[] arr =  line.split(" ");
			wordCount  = wordCount + arr.length;
			
			 for(String w :arr) {
				 if(map.get(w) == null) {
					 map.put(w, 1);
				 }else {
					 Integer f = map.get(w);
					 f++;
					 map.put(w, f);
				 }
			 }
			
			
			line = br.readLine();
		}
		System.out.println("wordCount  "+ wordCount);
		System.out.println(map);
		br.close();
		
	}
}
