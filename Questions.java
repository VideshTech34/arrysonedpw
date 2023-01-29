package arrayspw;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {
	
	static int[] smallestLargestElement(int[] arr) {
		
		Arrays.sort(arr);
		
		int[] ans = {arr[0],arr[arr.length-1]};
		
		System.out.println("Smallest : "+ans[0]);
		System.out.println("Largest : "+ans[1]);
		
		
		return ans;
		
		
	}
	
	/*static boolean isSorted(int[] arr) {
		boolean check = true;
		
		
		for(int i =1;i<arr.length;i++) {
			
			if(arr[i]<arr[i-1]) {
				check=false;
				break;
			}
		}
		return check;
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array : ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			
			
		}
		
		int ans[] = smallestLargestElement(arr);
		
		

	}

}
