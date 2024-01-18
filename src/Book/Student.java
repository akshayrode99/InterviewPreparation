package Book;

public class Student {
	
	public String name;
	//public static  String lastName = "Rode";
	
	public static String lastName = "Rode";

	
	
	public static void main(String[] args) {
		
		System.out.println(lastName);
		
		Student s1  = new Student();
		s1.name ="Akshay";
	
		Student s2 = new Student();
		s2.name = "Sagar";
		
		
		Student s3 = new Student();
		s3.name = "Mayur";
		
		Student s4 = new Student();
		s4.name = "Sham";
		//s4.lastName = "Rathod";
		
		Student s5 = new Student();
		s5.name = "Ram";
		
		
		
		System.out.println(s1.name+" "+s1.lastName);
		System.out.println(s2.name+" "+s2.lastName);
		System.out.println(s3.name+" "+s3.lastName);
		
		
		System.out.println(s4.name+" "+s4.lastName);
		
		System.out.println(s5.name+" "+s5.lastName);
	}

}
