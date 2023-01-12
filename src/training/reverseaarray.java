package training;

import java.util.Arrays;

public class reverseaarray {
	public static void reverse(int[] x)
	{
		int[] rev=new int[x.length];
		
		for (int i = 0,j=x.length-1; i < rev.length; i++,j--) {
			rev[j]=x[i];
			
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(rev));
	}
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		reverse(a);
	}
}
