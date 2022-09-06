package Damini_ObjectOrientedExamples;

interface Menucard 
{
	void paneertikka();
	void tandurRotti();
	}
public class Customer {

	void order(Menucard card)
	{
		card.paneertikka();
		card.tandurRotti();
	}
}
