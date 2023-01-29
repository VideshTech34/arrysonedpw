package arrayspw;

public class App {
	
	static void change_array(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		
	}
	
	static void change_value(int a) {
		 a =100;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[3];
		
		int a =5;
		
		change_value(a);
		
		System.out.println(a);
		
		arr[0]=1;
		arr[1]=3;
		arr[2]=9;
		
		change_array(arr);
		

	}

}
