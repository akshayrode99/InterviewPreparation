package Book;

//public class hello extends Thread {
//	public static void main(String[] args) {

//		System.out.println("Hello");



class hello extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread: " + i);
			try {
				// Sleep for 500 milliseconds
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		hello obj = new hello() ;

		obj.run();
	}
}




