package arrayspw;

import java.util.Scanner;

public class PrefixSum1 {
	
	static void printArray(int arr[]) {
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		
	}
	
	static int[] prefix(int arr[]) {
		
		int n = arr.length;
		
		
		
		for(int i =1;i<n;i++) {
			
			arr[i] = arr[i-1]+arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array Elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array:");
		
		printArray(arr);
		
		int pref[] = prefix(arr);
		
		printArray(pref);

	}

}
