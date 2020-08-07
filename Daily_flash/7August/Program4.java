/*
		Write a program that prints the maximum digit fram that number
		i/p - 123945
		o/p - "The maximum digit from number is 9

*/


class Program4 {

	public static void main(String[] args){

		int num = 123945, max = 0, rem = 0;
		int var = num;

		while(num!=0){

			rem = num%10;//starting from the last number
		
			if(rem > max)//checking condition
				max = rem;

			num = num/10;//dec the num

		}

		System.out.println("The maximum digit from number " + var + " is " + max);//prints largest num


	}

}
