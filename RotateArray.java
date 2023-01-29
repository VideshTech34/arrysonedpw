package arrayspw;

import java.util.Scanner;

public class RotateArray {
	
	static void printArray(int arr[]) {
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.println(arr[i] + " ");
		}
		
	}
	
	static int[]  rotateArray(int arr[],int k) {
		
		int n = arr.length;
		
		k = k%n;
		
		
		int ans [] = new int[n];
		int j =0;
		
		for(int i= n-k;i<n;i++) {
			
			ans[j++]=arr[i];
			
		}
		
		
	
		for(int i =0;i<n-k;i++) {
			ans[j++]=arr[i];
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		System.out.println("Enter the array element");
		
		 for(int i =0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 System.out.println("Enter the value of k");
		  
		 int k = sc.nextInt();
		 
		 int[] ans = rotateArray(arr, k);
		 
		 printArray(ans);
		

	}

}
