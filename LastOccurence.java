package arrayspw;

import java.util.Scanner;

public class LastOccurence {
	
	static int lastOccurence(int [] arr, int x) {
		
		
		
		 
		int lastIndex =-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				lastIndex =i;
			}
			
		
		}
		return lastIndex;
		
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
		
		System.out.println("Enter x");
		
		int x = sc.nextInt();
		
		System.out.println("Last Occurenc :"+lastOccurence(arr,x));
		
		
		
	}

}
