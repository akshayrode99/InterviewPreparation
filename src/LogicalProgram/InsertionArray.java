package LogicalProgram;

public class InsertionArray {
	public static void main(String[] args) {


		
		int a[]= {25,17,2,22,12,9};

		int n = a.length;
		int min = a[0];
		int temp;

		for(int m=0 ; m < n ; m++) {
			min = a[m];
			
			for(int i = m+1 ; i<n ; i++) {

				if(min>a[i]) {

					temp = a[m];
					a[m]=a[i];
					a[i]=temp;

					min=a[m];
				}
			}
		}
		for(int y =0 ; y<a.length ; y++) {
			System.out.print(a[y]+", ");
		}
	}
}



