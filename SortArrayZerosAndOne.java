package arrayspw;

import java.util.Scanner;

public class SortArrayZerosAndOne {
	
	static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	static void sortArrayValues(int arr[]) {
		
		int n = arr.length;
		int zeroes =0;
		for(int i =0;i<n;i++) {
			if(arr[i]==0) {
				zeroes++;
				
			}
		}
		
		for(int i=0;i<n;i++) {
			if(i<zeroes) {
				arr[i]=0;
			}
			else {
				arr[i]=1;
			}
		}
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
		
		System.out.println("Original Array : ");
		printArray(arr);
		
		sortArrayValues(arr);
		
		System.out.println("Array after sort : ");
		
		printArray(arr);
		

	}

}
