package Damini_ObjectOrientedExamples;



class MenuCardImpl implements Menucard
{

	@Override
	public void paneertikka() {
		System.out.println("Very nice taste");
		
	}

	@Override
	public void tandurRotti() {
		System.out.println("very good");
		
	}
	
	}
public class AbstactionDemo {
	public static void main(String[] args) {
		
		Customer c=new Customer();
		c.order(new MenuCardImpl());

	}

	
}
