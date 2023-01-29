package arrayspw;

import java.util.Scanner;

public class CountGreatest {
	
	

	
	
	
		static int lastOccurence(int [] arr, int x) {
			
			
			
			int count=0;
			 
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>x) {
					count=count+1;
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
			
			System.out.println("Enter x");
			
			int x = sc.nextInt();
			
			System.out.println("find great element :"+lastOccurence(arr,x));
			
			
			
		}

	}



