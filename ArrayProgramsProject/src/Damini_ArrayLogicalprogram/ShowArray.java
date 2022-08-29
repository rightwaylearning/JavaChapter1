package Damini_ArrayLogicalprogram;

public class ShowArray {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		int index=0;
		System.out.println(">>>>>>>>>>>>while>>>>>>>>>>>>");
		while(index<=arr.length)
		{
			System.out.println(arr[index]);
			index++;
		}
		System.out.println(">>>>>>>>>>>for>>>>>>>>>>>>");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(">>>>>>>>>>>>foreach>>>>>>");
		
		for(int e:arr)
		{
			// this control flow we can use with array & collection only
			System.out.println(e);
		}
	}
}
