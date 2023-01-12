package training;

public class primeno {
	public static void isprime(int num)
	{
		boolean flag=true;
		for (int j = 2; j <j%(num/2); j++) 
			
		
		if(num%2==0)
		{
			flag=false;
		}if(flag) {
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not a prime");
		}
	}
	
	public static void main(String[] args) {
		primeno.isprime(50);
	}
}



