package Practice;
import java.util.Scanner;

public class Lipic2 {
	public void show(int num) {

		if(num%4==0) {

			System.out.println("Year is leap");
		}
		else {
			System.out.println("Year is not leap");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entet a year");
		int num  = sc.nextInt(); 

		Lipic2 obj = new Lipic2();
		obj.show(num);
	}

}
