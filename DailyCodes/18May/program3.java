import java.util.*;

class BigBazaar{

	String prodName;
	float price = 0.0f;

	BigBazaar(String prodName, float price){

		this.prodName = prodName;
		this.price = price;

	}

	void display(){

		System.out.println("Product: " + prodName);
		System.out.println("Price: " + price);

	}

}

class LinkedListConst {

	public static void main(String[] args){

		LinkedList l1 = new LinkedList();

		l1.add(new BigBazaar("Gahoo",45.5f));
		l1.add(new BigBazaar("Tandool",50.5f));
		l1.add(new BigBazaar("Bajari",60.5f));
		l1.add(new BigBazaar("Jawari",55.5f));

		Iterator itr = l1.iterator();

		while(itr.hasNext()){

			BigBazaar obj = (BigBazaar)itr.next();
			obj.display();

		}

	}


}



