package training;
import java.util.*;

public class fourthedited {
	

	

	
	    public static  void main(String[] args) {
	    	String str="mohammedzeeshaan199";
	    	        int strLen = str.length();
	    	        String fivechars = "";
	    	        int splitbtw = 4;

	    	        for (int ch = 1; ch <= strLen; ch++) {
	    	            if (ch % splitbtw == 0) {
	    	            	char c=str.charAt(ch-1);
	    	                fivechars = fivechars + c;

	    	                System.out.println(fivechars);
	    	                fivechars = "";
	    	            } else {
	    	            	char c=str.charAt(ch-1);
	    	                fivechars = fivechars + c;
	    	            }

	    	        }
	    	        if (fivechars.length() <= 5 && fivechars.length() != 0) {
	    	            for (int i = 0; i < splitbtw; i++) {


	    	                if (fivechars.charAt(i) == 0) {
	    	                    fivechars = fivechars + "*";
	    	                }
	    	            }
	    	            System.out.println(fivechars);
	    	        }
	    	    }

		private static String str(int i) {
			// TODO Auto-generated method stub
			return null;
		}
	    }



	        
	    
	    


