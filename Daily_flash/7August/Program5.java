/*
		Write a program that prints the average of all the number
		i/p - 12345
		o/p - "The average of digit from number 12345 is 3

*/


class Program5 {

	public static void main(String[] args){

		int num = 12345, avg = 0, sum = 0, count = 0;
		int var = num;

		while(num!=0){

			sum = sum + (num%10);
			count++;
			num = num/10;//dec the num

		}

		avg = sum/count;
		System.out.println("The average digit from number " + var + " is " + avg);//prints avg num


	}

}
