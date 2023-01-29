package arrayspw;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
	
	static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		
		//int n = sc.nextInt();
		
		int arr[] = new int[5];
		
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		
		//System.out.println("Enter" + n +"element");
		//for(int i=0;i<arr.length;i++) {
			
			//arr[i] = sc.nextInt();
		//
		//for(int i=0;i<n;i++) {
			//System.out.print(arr[i]+ " ");
		//}
		
		System.out.println("Original array");
		printArray(arr);
		
		int arr2[] = Arrays.copyOf(arr,arr.length);
		
		System.out.println("Copied Array : ");
		printArray(arr2);
		
		//(int i=0;i<n;i++) {
			//System.out.print(arr2[i]+ " ");
		}
		
		
		

	}


