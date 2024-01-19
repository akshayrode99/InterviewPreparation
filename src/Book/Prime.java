package Book;

public class Prime {

	public void show(int n) {
		int i , j;

		for( i = 0 ; i <= n; i++) {

			for( j = 2 ; j < n ; j++ ) {

				if(i%j==0) {
					break;
				}
			}


			if	(i==j){

			}
		}
	}




	public static void main(String[] args) {
		Prime p = new Prime();
		p.show(50);
	}

}




