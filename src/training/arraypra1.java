package training;

import java.util.Arrays;
import java.util.List;

public class arraypra1 {
	public static void main(String[] args) {
		
	
//		int[] a= {10,20,30,40,50};
//		for (int k= 0; k < a.length; k++) {
//			System.out.println(a[k]+" ");
//			
//		}
//		int[] b=Arrays.copyOfRange(a, 0, 3);
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]+" ");
//			
//		}
		
		
List<Integer> list=Arrays.asList(4,5,6,8,23,35,36,77,78,99);
		
		//list.stream().limit(7).forEach(n -> System.out.println(n));
		list.stream().skip(6).forEach(n -> System.out.println(n));

		
		
		
		
		
	}

}
