package Damini_ArrayListExamples;

public class ALforEachExample {
	public static void main(String[] args) {
		
		int[] a=new int[4];
		a[0]=10;
		a[1]=40;
		a[2]=30;
		a[3]=70;
		
		for(int e:a)
		{
			System.out.println(e);
		}
		for(String s:args) {
			System.out.println(s);
		}
	}

}
