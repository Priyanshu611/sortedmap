import java.io.*;

class Program3 {

	public static void main(String[] args){

		float sum = 0, per = 0;
		int[] arr = new int[5];

		arr[0] = 35;
		arr[1] = 44;
		arr[2] = 48;
		arr[3] = 50;
		arr[4] = 36;
		

		for(int i = 0; i < 5; i++){

			sum = sum + arr[i];

		}

		per = (sum/250)*100;
		System.out.printf("Total marks = %.2f & Percentage = %.2f",sum,per);

		System.out.println();
	}

}
