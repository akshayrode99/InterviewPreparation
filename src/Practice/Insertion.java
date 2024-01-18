package Practice;

public class Insertion {
	public static void main(String[] args) {
		
		int a[] = {15 , 20 , 22 , 17 , 40 , 101 , 84 , 19 , 38};
		
		int size = a.length ; 
		int temp , j;
		
		
		for(int i = 1 ; i < size ; i++) {
			
			temp = a[i];
			j =i;
			
			while(j > 0 && a[j-1] > temp) {
				
			    a[j] = a[j-1];
				j = j-1;
			}
			a[j] =temp;
		}
		
		for(int z = 0 ; z < size ; z++) {
			
			System.out.print(a[z]+",");
			
		}
	}

}
