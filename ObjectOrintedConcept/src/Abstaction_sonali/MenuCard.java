package Abstaction_sonali;

interface Menu{
	void PannerTikka();
	void PannerMasaloa();
}




public class MenuCard implements Menu {

	@Override
	public void PannerTikka() {
		System.out.println("nice test");
		
		
	}

	@Override
	public void PannerMasaloa() {
		System.out.println("good test");
		
		
	}
	
}
	
	
