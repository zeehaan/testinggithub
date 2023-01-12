package training;

import java.util.Scanner;

public class fourthanswer {
	
	String ename;
	
	public fourthanswer(String ename)
	{
		this.ename=ename;
	}	
	public String RemoveNumber()
	{
		return ename.replaceAll("\\d"," ");
    }	
	public String RemoveStaces()
	{
		return ename.replaceAll(" ", "");
	}	
	
	public int GetTheLengthOfCharacter()
	{ 
		
		String ename=RemoveStaces();
		ename.replaceAll(" ", "");
		return ename.length();
	}	
	
	public void ArrangeAndPrint()
	{  String ename=RemoveStaces();
		for(int i=0,j=5;i<20;i++,j++)
		{		
			System.out.println(ename.subSequence(i,j));			
			System.out.println(" ");
			i+=4;
			j+=4;
//			if(i==20)
//			{
//				String ename=ename+"**";
//			}
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String value");
		 String str=sc.nextLine();
		fourthanswer ob=new fourthanswer(str);
		System.out.println("String after removing numbers :"+ob.RemoveNumber());
		System.out.println("String after removing numbers :"+ob.RemoveStaces());
		System.out.println("Length of the String :"+ob.GetTheLengthOfCharacter()); 
		ob.ArrangeAndPrint();		
	}
}
