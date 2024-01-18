package Practice;

public class Factorial {
	
	public void find(int n) {
		
		int fact = 1;
		
		for(int i = 1 ; i <=n ; i++) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);
		
	}
	
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		obj.find(4);
	}

}
