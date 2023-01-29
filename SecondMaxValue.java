package arrayspw;

import java.util.Scanner;

public class SecondMaxValue {
	
	static int findMax(int arr[]) {
		

		
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	static int findSecondMax(int arr[]) {
		
		
		
		int max = findMax(arr);
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		
		int secondMax = findMax(arr);
		
		return secondMax;
		
		
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
		
		System.out.println(findSecondMax(arr));
	}
}
