package arrayspw;

class ArrayExample{
	
	void MultiArrays() {
		int[][] ar1 = new int[5][3];
		
		int[][] arr = {{3,5,3},{4,25,5},{5,2,5}};
		
		int[][][] arr3 = new int[5][3][2];
		
		arr3[0][0][0]=1;
		
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		
		System.out.println(arr3[0][0][0]);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
		
		
		
		
	}
	
	void demoArrays() {
		
		int[] ages = new int[3];
		float[] weigts = new float[3];
		String[] names = {"videsh","pundir","Itwala"};
		
		ages[0]=33;
		ages[1]=34;
		ages[2]=35;
		//ages[4]=5;//out of bounds exception
		
		
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		for(int i:ages) {
			
			System.out.println(i);
			
		}
		
		System.out.println("Length of ages of array" +ages.length);
		System.out.println(weigts.length);
		
		int i=1;
		while(i<3) {
			System.out.println(ages[i]);
			i=i+1;
		}
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayExample ae = new ArrayExample();
		ae.demoArrays();
		
		ae.MultiArrays();

	}

}
