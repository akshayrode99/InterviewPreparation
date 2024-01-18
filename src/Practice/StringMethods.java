package Practice;

public class StringMethods {
	
		public static void main(String[] args) {

			String a ="Vijay";
			String b = "RajaHarishchandra";

			System.out.println("Length of a is = "+ a.length());
			System.out.println("Length of b is = "+ b.length());


			System.out.println("-------------------------------------");

			//-------------------------------.compareTo----------------------------------------------------------------		


			String s1="hellof";
			String s2="hello"; 
			String s3="hello"; 
			String s4="flag";
			System.out.println(s1.compareTo(s2)); 
			System.out.println(s1.compareTo(s3)); 
			System.out.println(s1.compareTo(s4)); 

			System.out.println("-----------compareTo------------------------");


			String p1="Akshay";
			String p2="Ajay";
			String p3="Suraj";

			System.out.println(p1.compareTo(p2));
			System.out.println(p1.compareTo(p3));
			
			System.out.println("--------------------------------------------");
			
			String v1 = "prashant";
			String v2 = "prajot";
			String v3 = "sham";
			
			System.out.println(v1.compareTo(v2));
			System.out.println(v1.compareTo(v3));

			System.out.println("----------------------concat------------------------------------");
			
			
			//---------------------------------.concat----------------------------------------------------------------

			String m1="hello";
			m1=m1.concat(" how are you");
			System.out.println(m1);


			String m2 ="hii"+" ";
			m2=m2.concat("how are you");
			System.out.println(m2);
			
			String m7 = "Akshay";
			m7.concat("is student");
			System.out.println(m7);
			
			m7=m7.concat(" is student");
			System.out.println(m7);


			System.out.println("--------------------isEmpty----------------------------------");


			//--------------------------------------.isEmpty----------------------------------------------------------		


			String m3 = "";
			String m4 = "Akshu";

			System.out.println(m3.isEmpty());
			System.out.println(m4.isEmpty());
			System.out.println(b.isEmpty());

			System.out.println("-------------------trim---------------------------");


			//---------------------------------.trim--------------------------------------------------------------		


			String m5="hello ";  
			System.out.println(m5+"how are you");        
			System.out.println(m5.trim()+"how are you");


			String m6="Basic ";
			System.out.println(m6+"this is basic program");
			System.out.println(m6.trim()+"this is basic program");


			System.out.println("---------------------toLowerCase----------------------------");

			//----------------------------------.toLowerCase---------------------------------------------------------------				



			String h1="HELLO HOW Are You?";
			String h1lower=h1.toLowerCase();
			System.out.println(h1lower);


			String h2="MY NAME IS XYZ";
			String abc = h2.toLowerCase();
			System.out.println(abc);

			System.out.println("--------------------toUpperCase--------------------------");


			//------------------------------------.toUpperCase------------------------------------------------------------



			String h3 = "my name is akshay";

			String h3a = h3.toUpperCase();
			System.out.println(h3a);

			//------------------------------------------------------------------------------------------------				

			String h4 = "akshay";

			String s = h4.toUpperCase();
			System.out.println(s);


			System.out.println("------------------------valueOf-------------------------------");
			//-----------------------------------.valueOf------------------------------------------------------------				

			int value=20; 
			String k1=String.valueOf(value); 
			System.out.println(k1+10);      



			float val = 20.5f;

			String k2 = String.valueOf(val);
			System.out.println(k2+40);

			char va = 20;
			String k3 = String.valueOf(va);
			System.out.println(k3+20);
			
			
			int valuee = 30;
			String k4 = String.valueOf(valuee);
			System.out.println(k4);

			System.out.println("---------------------------replace-----------------------------");


			//---------------------------------------.replace---------------------------------------------------------


			String r = "Harishchandra";

			String rs = r.replace("a", "l");
			System.out.println(rs);
			//--------------------------------------------------------//	
			String r1 = "India is my country";

			String er = r1.replace("country", "Love");
			System.out.println(er);
			
			String r2 = "My name is Akshay";
			
			String r3 = r2.replace("Akshay", "Sagar");
			
			System.out.println(r3);

			System.out.println("-------------------------contains-------------------------------");


			//---------------------------------------.contains---------------------------------------------------------				

			String name = "i am from Pune";

			System.out.println(name.contains("from Pune"));
			System.out.println(name.contains("i am"));
			System.out.println(name.contains("from P0  une"));
			System.out.println(name.contains("i will"));

			System.out.println("---------------------------equals----------------------------------");



			//-----------------------------------------.equals-------------------------------------------------------                	


			String z1 = "Rahul";
			String z2 = "Vijay";
			String z3 = "Rahul";
			String z4 = "rahul";
			String z5 = "NITIN";
			String z6 = "NITIN";

			System.out.println(z1.equals(z2));
			System.out.println(z1.equals(z3));
			System.out.println(z1.equals(z4));
			System.out.println(z2.equals(z3));
			
			System.out.println(z5.equals(z6));
			
			System.out.println("------------------------------------------------------------");
			
			
			String A1 = "Ram";
			String A2 = "Sham";
			String A3 = "Ram";
			String A4 = "sham";
			String A5 = "Rahul";
			
			System.out.println(A1.equals(A2));
			System.out.println(A1.equals(A3));
			System.out.println(A5.equals(z3));
			System.out.println("..."+A2.equals(A4));

			System.out.println("--------------------equalsIgnoreCase-----------------------------------");


			//------------------------------------------.equalsIgnoreCase-----------------------------------------------------	


			String y1 = "Rahul";
			String y2 = "Vijay";
			String y3 = "Rahul";
			String y4 = "rahul";

			System.out.println(y1.equalsIgnoreCase(y2));
			System.out.println(y1.equalsIgnoreCase(y3));
			System.out.println(y1.equalsIgnoreCase(y4));
			System.out.println(y2.equalsIgnoreCase (y3));
			
			String y5 = "Sham";
			String y6 = "sham";
			
			System.out.println(".."+ y5.equalsIgnoreCase(y6));
			

			System.out.println("-------------------------toCharArray-----------------------------------");


			//--------------------------------------.toCharArray-----------------------------------------------------------	


			String w = "love";
			char [] w1 = w.toCharArray();
			for(int i = 0 ; i < w1.length; i++) {
				System.out.println(w1[i]);
			}
			
			
			System.out.println("----------------------------------------------------");
			
			String w2 = "Love";
			
			char[] w3 = w2.toCharArray();
			
			for(int i = 0 ; i < w2.length() ; i++) {
				
				System.out.print  (w3[i]);
			}
			
			System.out.println("--------------------getBytes-------------------------");


			//-----------------------------------------.getBytes-------------------------------------------------------					


			String f3 = "akshay";
			byte [] f4 = f3.getBytes();
			for(int i=0 ; i<f4.length ; i++) {
				System.out.println(f4[i]);
			}

			String f1="AMO";
			byte[] f2=f1.getBytes(); 
			for(int i=0;i<f2.length;i++){ 
				System.out.println(f2[i]);
			}

			System.out.println("------------------------endsWith---------------------------");


			//------------------------------------------------------------------------------------------------					


			String c="hello how are you"; 
			System.out.println(c.endsWith("u`"));      
			System.out.println(c.endsWith("you"));      
			System.out.println(c.endsWith("how"));  

			String c1 = "hii i am student"; 
			System.out.println(c1.endsWith("how"));
			System.out.println(c1.endsWith("student"));
			System.out.println(c1.endsWith("Student"));
			System.out.println(c1.endsWith("how"));

			
			String c2 = "i have completed my computer science";
			
			System.out.println(c2.endsWith("my"));
			System.out.println(c2.endsWith("i"));
			System.out.println(c2.endsWith("science"));

		}
	}
