package JavaInterface;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;

public class Interface {

	public void print() {
	  

	class A6 implements Pageable{  
		public void print(){System.out.println("Hello");

		}  

	

		public void main(String args[]){  
			A6 obj = new A6();  
			obj.print();  
		}



		@Override
		public int getNumberOfPages() {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
			// TODO Auto-generated method stub
			return null;
		}  
	}  
}

}
