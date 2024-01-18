package LogicalProgram;

public class Swapping {
	public static void main(String[] args) {
		
		int a [] = {47,22,34,12,40,31};

		int i ;
		int x = a.length;
		int min=a[0];
		int temp;

		for( i = 1 ; i<x ; i++) {
			
			if (min > a[i]) {
				
				temp = a[0];

				a[0]=a[i];
				a[i]=temp;
				
				min=a[0];                
			}
		}
		for(int y =0 ; y<a.length ; y++) {
			System.out.print(a[y]+", ");
		}

	}

}
