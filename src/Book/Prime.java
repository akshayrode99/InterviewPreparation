package Book;

public class Prime {
	
	public static void main(String[] args) {
		
		int i , j ;
		
		for( i = 0 ; i<=50 ; i++) {
			
			for( j = 2 ; j < 50 ; j++) {
				
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println(i);
			}
		}
	}
}

