package arrayspw;



import java.util.Scanner;

public class FirstRepeating {
	
	static int firstRepeatValue(int arr[]) {
		
		int ans =-1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		
		int arr[] = new int[n];
		
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println(firstRepeatValue(arr));
		

	}

}
