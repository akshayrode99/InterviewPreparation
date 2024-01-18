package NewPractice;

public class Fact {
 	 int i ,  fact =1 ;

	
	public void find(int n) {
		
		
		for(i = n ; i >= 1 ; i--) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);
		
	}
	
	public static void main(String[] args) {
		
		Fact f = new Fact();
		f.find(4);
	}

}
