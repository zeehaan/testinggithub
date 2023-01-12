package training;

public class arraypra3 {
public static void main(String[] args) {
	int[] arr=new int[10];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i*10+i;
	}
	for(int i:arr)
	System.out.println(i);
}
}
