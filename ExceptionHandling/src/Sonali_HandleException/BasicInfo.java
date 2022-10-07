package Sonali_HandleException;

public class BasicInfo {
	public static void main(String[] args) {
		System.out.println("<<<<<<<<start>>>>>>>>>>>>>");
		int n = 0;
		try {
			Integer i = 10 / n;

		} catch (Exception e) {
			System.out.println("<<<<<<<<Error Occured>>>>>>>>>>>>>");
		}
		System.out.println("<<<<<<<<end>>>>>>>>>>>>>");

	}
}