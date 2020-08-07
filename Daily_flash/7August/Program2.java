/*
		Write a program and print additon of even diigts and multi of odd digits
		i/p - 12345
		o/p - addition of even digits - 6
		      multiplicaton of odd digits - 15

*/


class Program2 {

	public static void main(String[] args){

		int num = 12345, rem = 0, add = 0, mul = 1, count = 0;

		while(num!=0){

			rem = num%10;//starting from the last number

			if(rem%2 == 0){// check condition for even

				add = rem + add;//addding even digits
				count++;//inc count

			} else {// codition for odd nos

				mul = mul*rem;//multiplying odd nos
				count++;//inc count

			}

			num = num/10;//decrementing the number

		}

		System.out.println("Addition of even digit - " + add);//prints addition of even nos
		System.out.println("Multiplication of odd digit - " + mul);//prints multi of odd nos

	}

}
