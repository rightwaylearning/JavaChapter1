package Sonali_HandleException;

class TooYoungExecption extends RuntimeException {
	TooYoungExecption(String s) {
		super(s);
	}
}

class OldException extends RuntimeException {
	OldException(String s) {
		super(s);
	}
}

public class CustomizedExceptionDemo {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if (age > 50) {
			throw new TooYoungExecption("please wait some more time ..... u will get best match");
		} else {
			if (age < 18)
				throw new OldException("\"u r age already crossed .... no chance of getting married");

		}

		System.out.println("you will get match details soon by e-mail");
	}
}
