package LogicalProgram;
import java.util.Arrays;
public class InsertionSort {
	public static void main(String[] args) {

		int a[] = { 5, 11 , 6 , 2 , 4 , 9};


		int x =  a.length;

		//	System.out.println(x);

		int min = a[0];
		// 	System.out.println(min);

		for(int i = 1 ; i<x; i++) {

			for(int j = 1; j<=i ; j++) {

				if(min>a[i]) {

					min=a[i];
					
					System.out.println(" " +min);
					

				}	
				
			}	
			
		}	
	}
}
