package Sahil_array;

public class controllerSosayti {

public static void main(String[] args) {
	
	sosayti[] s = new sosayti [5];
	
	s[0] = new sosayti();
	s[0].sosaytiName = "'BALAJI SOSATYI'";
	s[0].ownerName = "Mr. sahil";
	s[0].faltNO = 25;
	s[0].ving = "A";
	s[0].address = "Mumbai";
//---------------------------------------------//	
	s[1] = new sosayti ();
	s[1].sosaytiName ="'BALAJI SOSATYI'";
	s[1].ownerName= "Mr. Akshy";
	s[1].faltNO = 26;
	s[1].ving =	"A";
	s[1].address = "Mumbai";
//-------------------------------------------//
	s[2] = new sosayti ();
	s[2].sosaytiName = "'BALAJI SOSAYTI'";
	s[2].ownerName = "Mr.vishal";
	s[2].faltNO = 27 ;
	s[2].ving = "A";
	s[2].address = "Mumbai";
//------------------------------------------//
	s[3] = new sosayti();
	s[3].sosaytiName = "'BAJAJI SOSAYTI'";
	s[3].ownerName = "Mr.ronit";
	s[3].faltNO = 27;
	s[3].ving = "A";
	s[3].address = "Mumbai";
	
//-----------------------------------------//
	
	s[4] = new sosayti ();
	s[4].sosaytiName = "'BALAJI SOSAYTI'";
	s[4].ownerName = "Mr.saket";
	s[4].faltNO = 28;
	s[4].ving = "A";
	s[4].address = "Mumbai";
	
//-----------------------------------------//

 
    s[0].showDetils();
	s[1].showDetils();
	s[2].showDetils();
	s[3].showDetils();
	s[4].showDetils();
	

	


	
}
}
