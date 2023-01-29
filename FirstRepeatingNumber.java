package arrayspw;

import java.util.Scanner;

public class FirstRepeatingNumber {
	
	static int firstRepeating(int arr[]) {
		
		int n = arr.length;
		
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		
		return -1;
		
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

		System.out.println("Firt Repeating Element : "+firstRepeating(arr));
	}

}
