class MyException extends Exception {

	String msg = null;
	
	MyException(String str){

		msg = str;

	}

	public String toString(){

		return msg;

	}

}

class CustomizedException {

	static void checkIn(int weight)throws MyException{

			if(weight > 50){

				throw new MyException("Weight exceeded the required limit");

			}
	}

	public static void main(String[] args){

		try{

			checkIn(54);

		}catch(MyException obj){

			System.out.println("In catch");
			System.out.println("My exception " + obj.toString());
			

		}

	}



}

/*
lfmsd;l sjiv ldfmidji  fkfjf fdgo
jnviuvi
mvjoi djoidsji
jfoijf pjoiwef
jojoj woeoewjk
*/
