package Practice;

public class FindMinimum {

	public static void main(String[] args) {

		int a[] = {27 , 36 , 17 , 22 , 77 , 11 , 9 , 18 , 22 , 33 , 2 ,10 , 99 , 87};
		
		int size = a.length;
		int min = a[0];
		
		
		for(int i = 1 ; i < size ; i++) {
			
			
			if(min > a[i]) {
				
				min = a[i];
			}
		}
		System.out.println("Minimum number is = "+min);

	}

}
