package training;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
int[] a= {8,7,9,1,2,3,4};
for(int z:a)
	System.out.println(z);
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]>a[j])
				{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
				}
	}
	
	
}System.out.println(Arrays.toString(a));
	}

}

