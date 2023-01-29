package arrayspw;

import java.util.Scanner;

public class Sorted {
	
	static boolean sortArray(int arr[]) {
		
		boolean check = true;
		
		for(int i =1;i<arr.length;i++) {
			
			if(arr[i]<arr[i-1]) {
				
				check = false;
				
				
				
			}
		}
		return check;
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
		
		System.out.println("Is Sorted : "+sortArray(arr));

	}

}
