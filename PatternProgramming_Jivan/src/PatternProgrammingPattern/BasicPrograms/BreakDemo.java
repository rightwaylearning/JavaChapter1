package PatternProgrammingPattern.BasicPrograms;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int j = 1; j <= 10; j ++) {
			
			for(int i = 1; i <= 10; i ++) {
			System.out.println(i*j);
			if(j==5) {
				break;
			}
		}
	}
}
}