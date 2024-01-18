package Practice;

public class FindMin {

	public static void main(String[] args) {

		int a[] = {10 , 16 , 9 , 27 , 13 , 83 , 66, 72 , 48 , 69 , 12 , 38,  45 , 67 };

		int temp ; 

		int size = a.length;


		for(int i = 0 ; i < size ; i++) {

			for(int j = 0 ; j < size-1 ; j++) {

				temp = a[j];

				if(a[j] > a[j+1]) {

					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

			for(int x = 0 ; x < size ; x++) {

			}
		}
		System.out.println(a[0]);
	}

}
