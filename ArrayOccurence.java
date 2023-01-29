package arrayspw;

import java.util.Scanner;

 
	
	
	
	
	
	


public class ArrayOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array :");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements : ");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
			
			
			
			
			
		}
		
		System.out.println("Enter x");
		
		int x = sc.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count=count+1;
				
			
		
		
		
			}
		}
		
		System.out.println("Array Occurence "+count);
	}
}
