package Practice;

public class Even {
	
	public void find(int n) {
		
		for(int i = 1 ; i <= n ; i++) {
			
			if(i%2==0) {
				
				System.out.print(i+"  ,");
			}
		}
	}
	public static void main(String[] args) {
		
		Even n = new Even();
		n.find(15);
	}
}
