package LogicalProgram;
import java.util.Arrays;

public class InsertionSortAlgo {
	public static void main(String[] args) {


		int a[]= {7,4,5,9,1,3};

		int i ;
		int x = a.length;
		int min=a[0];
		int temp;

		for( i = 1 ; i<x ; i++) {

			if(min>a[i]) {

				temp = a[0];

				a[0]=a[i];
				a[i]=temp;
			}
			System.out.println(a[0]);

		}

	}

}


