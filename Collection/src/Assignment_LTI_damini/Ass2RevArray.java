package Assignment_LTI_damini;

public class Ass2RevArray {
public static void main(String[] args) {
	
	int[] a= {10,30,50,49,57};
	int stindex=0;
	int edindex=0;
	int temp;
	System.out.println("Array="+a.length);
	
	for(int i=0;i<a.length/2;i++)
	{
		stindex=i;
		edindex=(a.length-1)-i;
		if(stindex>=edindex)
		{
			break;
		}
		else
		{
			temp=a[stindex];
			a[stindex]=a[edindex];
			a[edindex]=temp;
			System.out.println(temp);
		}
		System.out.println(edindex);
	}
}
}
