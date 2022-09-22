package Assignment_LTI_damini;

import java.util.ArrayList;

public class Ass3MergeArray {

	public static void main(String[] args) {
		
		int[] a= {1,4,5,6,7,4,3};
		int[] b= {2,4,6,9,7,0,1};
		
		ArrayList al=new ArrayList();
		for(int e:a)
		{
			if(isDuplicate(a,e)==false)
			{
				al.add(e);
			}
		}
		for(int e:b)
		{
			if(isDuplicate(b,e)==false)
			{
				al.add(e);
			}
		}
		System.out.println(al);
		
	}
	static boolean isDuplicate(int[] ar,int n)
	{
		int fr=0;
		for(int e:ar)
		{
			if(n==e)
			{
				fr++;
				if(fr>=2)
				{
					return true;
				}
			}
		}
		return false;
	}
}
