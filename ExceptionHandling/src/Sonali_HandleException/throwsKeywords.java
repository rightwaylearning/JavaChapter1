package Sonali_HandleException;

public class throwsKeywords {
	public static void main(String[] args) throws InterruptedException {
		doStuff();
		System.out.println("First Block");
			
		}
		public static void doStuff()throws InterruptedException{ 
			doMoreStuff(); 
			System.out.println("Second Block");
			}
			public static void doMoreStuff()throws InterruptedException{
			System.out.println("Third Block");
			Thread.sleep(5000);
		}
	}


