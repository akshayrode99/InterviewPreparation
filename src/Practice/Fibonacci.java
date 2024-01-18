package Practice;

public class Fibonacci {

	public void find(int n) {
		
		int p = 0 ; int p1 = 1 ; int q ;
		
		
		System.out.print(p+","+p1);
		
		for(int i = 1 ; i < n ; i++) {
			
			q = p+p1;
			
			p = p1;
			p1 = q;
			
			System.out.print(","+q);
		}	
	}

	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		
		obj.find(10);

	}
}
