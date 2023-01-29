package arrayspw;

import java.util.Scanner;

public class PrefixSum2 {
	
	static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]+ " ");
		}
	}
	
	static int [] prefixSum(int arr[]) {
		
		
		
		for(int i =1;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		
		System.out.println("Enter array Elements :");
		
		for(int i=1;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		int preSum[] = prefixSum(arr);
		System.out.println("Enter the queries to search : ");
		
		int q = sc.nextInt();
		
		
		while(q-->0) {
			
			System.out.println("Enter the range : ");
			
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int ans = preSum[r]-preSum[l-1];
			
			System.out.println("Sum"+ans);
		}
		
		

	}

}
