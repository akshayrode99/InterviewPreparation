package LogicalProgram;

public class PrimeMethod2 {
	public boolean show(int n) {
		
		
		for(int j =2 ; j<n ; j++) {
			
			if(n%j==0) {
				return false;
			}
		}
		return true;
	
	}
	public static void main(String[] args) {
		PrimeMethod2 obj = new PrimeMethod2();
		
	boolean z =	obj.show(8);
	
	System.out.print("The number is Prime = " +z);
	
	}

}
