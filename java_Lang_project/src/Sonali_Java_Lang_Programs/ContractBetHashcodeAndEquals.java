package Sonali_Java_Lang_Programs;
class S{
	int a;
	int b;
	S(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof S) {
			S s = (S)obj;
			if(this.a == s.a && this.b == s.b) {
				return true;
			}
		}
			return false;
		}
		
	
}
public class ContractBetHashcodeAndEquals {
	public static void main(String[] args) {
		S s = new S(10,40);
		S s1 = new S(10,40);
		S s2 = new S(50,40);
		S s3 = new S(10,40);
		S s4 = new S(20,40);
		S s5 = s2;

		System.out.println(s.equals(s1));//true
		System.out.println(s.equals(s2));//false
		System.out.println(s.equals(s3));//true
		System.out.println(s.equals(s4));//false
		System.out.println(s2.equals(s5));//true
		System.out.println("==============================");
		System.out.println(s.hashCode()==s1.hashCode());//false
		System.out.println(s.hashCode()==s2.hashCode());//false
		System.out.println(s.hashCode()==s3.hashCode());//false
		System.out.println(s.hashCode()==s4.hashCode());//false
		System.out.println(s.hashCode()==s5.hashCode());//false
		
	}
		
	}


