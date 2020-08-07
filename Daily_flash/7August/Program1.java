/*
		Write a program to count digits in a number
		i/p - 12345
		o/p - 5
*/


class Program1 {

	public static void main(String[] args){

		int num = 987;
		int var = num;
		int count = 0, rem = 0;

		while(num!=0){

			rem = num%10;//starting from last num
			count++;//inc count
			num = num/10;//decrementing num

		}

		System.out.println("Number of digits in " + var + " is " + count);

	}

}
