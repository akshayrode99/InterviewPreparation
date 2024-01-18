package LogicalProgram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Insertionn {
	public static void main(String[] args) {
		
		int a[] = {43 , 11, 22 , 52 , 2, 3, 7, 13 , 17 , 3 , 19 , 11};
		//ArrayList
		int n = a.length;
		int min ; 
		int temp ; 
		System.out.println("Sort Start Time : " + LocalDateTime.now());
		
		for(int i = 0 ; i < n ; i++) {
			
			min=a[i];
			
			for(int j = i+1 ; j < n ; j++) {
				
				if(min > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
					min = a[i];
				}
			}
		}
		
		System.out.println("Sort End Time : " + LocalDateTime.now());
		
		for(int x = 0 ; x < n ; x++) {
			
			System.out.print(a[x]+", ");
		}
	}
	
	

}
