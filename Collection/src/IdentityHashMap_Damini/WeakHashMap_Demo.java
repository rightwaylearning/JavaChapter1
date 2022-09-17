package IdentityHashMap_Damini;

import java.util.WeakHashMap;

public class WeakHashMap_Demo {

	public static void main(String[] args)throws Exception {
		
		WeakHashMap<Test,Integer> wk=new WeakHashMap<>();
		Test t=new Test(10);
		wk.put(t,10000);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wk);
		
		
	}
}
class Test
{
	int i;
	Test(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		return ""+this.i;
	}
	@Override
	public void finalize() throws Throwable {
		System.out.println("compelte my work ");
	}
	
	
	
	}
