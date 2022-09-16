package identity.hashmap.programs;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakhashMapDemo {

	public static void main(String[] args) throws Exception {
			
		WeakHashMap<Test, Integer> map = new WeakHashMap<>();
		Test t= new Test(10);
		map.put(t, 10000);
		t = null;
		
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(map); //{}
			
	}
}

class Test{
	int i;
	Test(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.i;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(">> I am done my work.");
	}
}