package arrayspw;

import java.util.Scanner;

public class TargetSum {
	
	static int pairSum(int arr[] ,int target) {
		
		
		int count =0;
		int n = arr.length;
		for(int i=0;i<n;i++) {//first number
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {//second number
					
					count=count+1;
					
				}
			}
		}
		
		return count;
		
		
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
		
		System.out.println("Enter Target Sum");
		
		int target = sc.nextInt();
		
		System.out.println(pairSum(arr,target));

	}

}
