package throwsinfo.details;

public class Controller {

	public static void main(String[] args) {
		System.out.println("JVM start main method");
		MathsAgent m = new MathsAgent();
		m.doOperation(100, 100);
		System.out.println("JVM end with main method");
	}
}

// p/o (happy flow) a = 100 & b = 200
// case 1]
// JVM start main method
// operation start
// sum = 300
// div = 0
// sub = -100
// mul = 20000
// operation end
// JVM end with main method

// case 2] a = 100 b =0
// JVM start main method
// operation start
// sum = 100
// 
// case 3] a = 100, b= 0 & we are keeping risky code inside try block

 // JVM start main method
//  operation start
// sum = 100
//  exception message print
// sub = 100
// mul = 0
// operation end
//JVM end with main method

// case 4]  here we are not intrested to handle exception

//JVM start main method
//operation start
//sum = 100
// exception message
// operation end
//JVM end with main method







