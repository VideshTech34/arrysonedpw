package arrayspw;

import java.util.Scanner;

public class ReverseArray {
	
	static void printArray(int[] ans) {
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i] + " ");
		}
	}
	
	static int [] reverseArray(int [] arr) {
		
		int n = arr.length;
		
		int ans[] = new int[n];
		
		int j=0;
		
		
		for(int i =n-1;i>=0;i--) {
			
			ans[j++]=arr[i];
			
		
			
			
		}
		return ans;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6};
		
		int[] ans = reverseArray(arr); 
		
		printArray(ans);
		
		
		

	}

}
