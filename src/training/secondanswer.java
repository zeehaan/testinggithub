package training;

public class secondanswer {
	//creation of cube
	 //lengthofsideofacube=a;
	private double a=1;
	//modifiedvertexlength=b;
	double b;
	public static void main(String[] args) {
		
	
	secondanswer ob=new secondanswer();
	ob.getvolumeofthecube();
	ob.getsurfaceareaofthecube();
	ob.doublethesizeofthecube();
	ob.modifyveertexlength(2);
//	System.out.println("After changing the vertexlength");
//	ob.getvolumeofthecube();
//	ob.getsurfaceareaofthecube();
//	ob.doublethesizeofthecube();
	}
	public void getvolumeofthecube() {
		System.out.println("volume of the cube is "+(a*a*a));
	}
	
	public void doublethesizeofthecube() {
		System.out.println( "After doubling the size of a cube the value is "+(2*a*a*a));
		
	}
	
	public void getsurfaceareaofthecube() {
		System.out.println("The surface of a cube is " + (6*a*a));
		
	}
	
	public void modifyveertexlength (double b) {
		double a=b;	
		
	}	

}
