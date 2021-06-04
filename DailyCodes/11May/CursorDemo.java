import java.util.*;

class CursorDemo {

	public static void main(String[] args){

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);	
		v.addElement(30);	
		v.addElement(40);

		Enumeration e = v.elements();

		while(e.hasMoreElements()){

			int val = (Integer)e.nextElement();

			if(val%4 == 0)
				System.out.println(val);


		}			


	}



}
