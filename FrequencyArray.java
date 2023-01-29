package arrayspw;

import java.util.Scanner;


		

public class FrequencyArray {
	
	static int[] makeFrequency(int [] arr) {
		
		int n = arr.length;
		
		
		int freq[] =  new int[100005];
		
		for(int i =0;i<arr.length;i++) {
			
				freq[i]++;
			
		}
		return freq;
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
		int[] freq = makeFrequency(arr);
		
		System.out.println("Enter the frequency to be searched : ");
		
		int q = sc.nextInt();
		
		while(q>0) {
			System.out.println("Enter the number  to be search : ");
			
			int x = sc.nextInt();
			if(freq[x]>0) {
				System.out.println("YES");
			}
			else {
				System.out.println("No");
				
			}
			
			q--;
		}
		
		
		

	}


	}

	


