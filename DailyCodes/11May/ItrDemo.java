import java.util.*;

class ItrDemo {

	public static void main(String[] args){

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);	
		v.addElement(30);	
		v.addElement(40);

		Iterator i = v.iterator();

		while(i.hasNext()){

			int val = (Integer)i.next();

			if(val%4 == 0)
				i.remove();
				


		}

		System.out.println(v);			


	}



}
