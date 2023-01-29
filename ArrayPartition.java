package arrayspw;

import java.util.Scanner;

public class ArrayPartition {
	
	static void printArray(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static int findArraySum(int [] arr) {
		int totalSum =0;
		
		for(int i=0;i<arr.length;i++) {
			totalSum+=arr[i];
		}
		return totalSum;
	}
	
	static boolean equalSumPartition(int [] arr) {
		
		int totalSum = findArraySum(arr);
		
			
		int preSum=0;
		
		for(int i=0;i<arr.length;i++) {
			preSum+=arr[i];
			int suffixSum = totalSum-preSum;
			if(suffixSum==preSum) {
				return true;
			}
		}
		return false;
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
		
		System.out.println("Equal Partition Possible : "+equalSumPartition(arr));

	}

}
