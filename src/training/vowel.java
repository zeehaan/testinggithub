package training;

public class vowel {

	public static void main(String[] args) {
String s="Pooja";
s.toLowerCase();
boolean flag=false;
for (int i = 0; i < s.length(); i++) 
 {
	

if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='o'))
    {
	flag=true;
	}

}if(flag)
{
	System.out.println("it is a vowel");
	}
else {
	System.out.println("it is not a vowel");
            }
	      }

}
