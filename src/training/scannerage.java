package training;

import java.util.Scanner;

public class scannerage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=sc.nextInt();
		if(a<18)
		{
			System.out.println("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

}
