package Practice;
  
public class FIndMaximum {
	
	public static void main(String[] args) {
		
		int a [] = {83 , 26 , 81, 99 , 38 , 73 , 101 , 29, 127 , 52 , 69 , 42 , 28 , 18 , 44 , 121 };
		
		int size = a.length;
		int max = a[0] ;
		
		
		for(int i = 1 ; i < size ; i++) {
			
			if(max < a[i]) {
				
				max = a[i];
			}
		}
		System.out.println("Max Number Is = " +max);
	}

}
