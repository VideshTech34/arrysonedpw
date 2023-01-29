package arrayspw;

import java.util.Scanner;

public class TripletSum {
	
	static int tripletSum(int arr[] ,int target) {
		
		
		int count =0;
		int n = arr.length;
		for(int i=0;i<n;i++) {//first number
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k] == target) {
						
						count++;
					}
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
		
		System.out.println(tripletSum(arr,target));

	}

}

