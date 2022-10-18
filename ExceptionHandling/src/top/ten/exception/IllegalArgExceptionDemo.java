package top.ten.exception;

public class IllegalArgExceptionDemo {

	public static void main(String[] args) {
		
		Thread t = new Thread();
		int p = 100;
		t.setPriority(p);
	}
}

// AssertException
// IllegalStateException
// ExceptionInInitializerError


