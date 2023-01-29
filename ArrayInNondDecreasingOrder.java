
package arrayspw;

import java.util.Scanner;

public class ArrayInNondDecreasingOrder {
	
	
static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
}
	
static void swapInArray(int arr[], int i, int j) {
		
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
	
	static void  reverseArray(int arr[]) {
		
		int i =0; int j = arr.length-1;
		
		while(i<j) {
			swapInArray(arr,i ,j);
			i++;
			j--;
		}
		
		
	}

	static int[] sortArrayNonD(int arr[]) {
		int n = arr.length;
		
		int left =0,right = n-1;
		
		int ans[] = new int[n];
		int k =0;
		while(left<=right) {
			if(Math.abs(arr[left])>Math.abs(arr[right])){
				ans[k++] = arr[left]*arr[left];
				left++;
				
				
			}
			else {
				ans[k++]=arr[right]*ans[right];
				right--;
		}
		
	}
		return ans;
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
		
	int[] ans = 	sortArrayNonD(arr);
		
		System.out.println("Sorted Array in Decreasing Order : ");
		reverseArray(ans);
		
		printArray(ans);

	}

}
