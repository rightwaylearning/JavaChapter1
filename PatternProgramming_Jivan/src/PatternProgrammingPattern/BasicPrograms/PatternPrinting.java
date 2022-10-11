package PatternProgrammingPattern.BasicPrograms;

public class PatternPrinting {

	void printStartpattern(int n) {
		for(int i = 1; i <= n; i ++) {
		System.out.print("* * * *");
		}
	}		
	
	public static void main(String[] args) {
		PatternPrinting p = new PatternPrinting();
		int input = 10;
		p.printStartpattern(input);
	}
}
