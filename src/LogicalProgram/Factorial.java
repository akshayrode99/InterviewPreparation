package LogicalProgram;

public class Factorial {

	public void show(int n ) {
		int fact=1;
		
		//5 cha fact = 5*4*3*2*1;
		
		for(int i = 1 ; i<=n ; i++) {
			
			fact = fact*i;
				
		}
		System.out.println("the fact is = " +fact);

	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.show(5);		
	}
}

