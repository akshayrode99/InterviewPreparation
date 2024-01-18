package LogicalProgram;

public class Primee {
	public void show(int n) {
		int i , j;

		for(i = 1 ; i<=n ; i++) {
			for(j = 2 ; j<i ; j++) {

				if(i%j==0) { 
					break;
				}
			}
			if(i==j) {
				System.out.print(i+ ",");
			}
		}
	}
	public static void main(String[] args) {
		Primee p = new Primee();
		p.show(100);
	}

}
