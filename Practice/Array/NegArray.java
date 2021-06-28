//Arrange all the negative nos at one side of the array
import java.io.*;
class NegArray {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array: ");

		int size = Integer.parseInt(br.readLine());

		
		int arr[] = new int[size];

		System.out.println("Enter the values of array: ");


		for(int i = 0; i < size; i++){

			arr[i] = Integer.parseInt(br.readLine());

	
		}


		for(int i = 0; i < arr.length; i++){

			for(int j = i+1; j < arr.length; j++){
		
				int temp = 0;

				if(arr[i] > arr[j]) {
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				}

			}
		
		}
	
	
		System.out.println();
		System.out.println("Sorted Array");

		
		for(int i = 0; i < size; i++){

			System.out.println(arr[i]);

		}


	}

}

//GFG logic for this code

/*	int temp,j = 0;
	for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
*/
