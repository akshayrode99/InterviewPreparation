package NewPractice;

public class Fibo {
	public void find(int n) {
		
		int n1 = 0 , n2 = 1 , n3 , i;
		
		System.out.print(n1+", "+n2);
	
		for( i = 1 ; i<=n ; i++) {
			
			n3 = n1+n2 ; 
			
			System.out.print(" , "+n3);
			
			n1 = n2 ; 
			n2 = n3 ;
		}
	
	}
	
	public static void main(String[] args) {
		
		Fibo obj = new Fibo();
		obj.find(5);
	}

}
