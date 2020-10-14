
import java.util.*;

class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int oddC = 0;
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int odd[] = new int[size]; 
		System.out.println("Enter the elements in an array: ");
		for(int i=0;i<size;i++) {

			arr[i] = sc.nextInt();
		}
		
		int num ;
		int count;
		int flag = 0;
		int index =0;
		for(int i=0;i<size;i++) {
			count=0;
			num = arr[i];
			for(int k=0;k<size;k++) {
				if(num==odd[k]) {
					flag = 1;
					break;
				}
			}

			if(flag==1)
				continue;
			else {
			
				for(int j=0;j<size;j++) {

					if(num == arr[j])
						count++;
				}
				if(count%2!=0) {
					odd[index] = num;
					index++;
				}
			}
		}
		

		System.out.print("Odd elements in array are: ");
		for(int i=0;i<index;i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
	}
}
