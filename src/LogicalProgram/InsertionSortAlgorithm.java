package LogicalProgram;
import java.util.Arrays;
public class InsertionSortAlgorithm {
	public static void main(String[] args) {
		
		int array [] = {12 , 7 , 4 , 18 , 6};
		
		int x = array.length;
		
	//	System.out.println(x);
		
	//	int min = array[0];
		
		for(int i = 0 ; i<x ; i++) {
			
			for(int j = i ; j<i+1 ; i++) {
				
				if(i>j) {
					
					i=j;
					
					System.out.println(i);
				}
			}
		}
	}

}
