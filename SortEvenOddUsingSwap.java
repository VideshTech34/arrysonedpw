package arrayspw;

import java.util.Scanner;



public class SortEvenOddUsingSwap {
	
static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
static void swap(int arr[],int i,int j) {
	
	int temp = arr[i];
	
	arr[i] = arr[j];
	arr[j]= temp;
}

static void sorts(int arr[]) {
	
	int n = arr.length;
	int left =0,right=n-1;
	
	while(left<right) {
		if(arr[left]%2==1 && arr[right]%2==0) {
			swap(arr,left,right);
			
			left++;
			right--;
		}
		
		if(arr[left]%2==0) {
			left++;
		}
		if(arr[right]%2==1) {
			right--;
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
		
		sorts(arr);
		
		System.out.println("Array after sort : ");
		
		printArray(arr);
		

	}

}

