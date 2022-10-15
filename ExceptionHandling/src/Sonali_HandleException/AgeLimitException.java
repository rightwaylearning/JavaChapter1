package Sonali_HandleException;

public class AgeLimitException extends RuntimeException {
	AgeLimitException(){
		super("AgeLimitException , because of age is greter than 18 or 21");
	}

}
