package arrayspw;

class Array {
	
	void demoArray() {
		
		int a[] = {8,4,5,6,7};
		
		int ans=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>ans) {
				ans = a[i];
			}
		}
		
		System.out.println("Max found :"+ans);
	}

	
		
	}


public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Array a1 = new Array();
		a1.demoArray();

	}

}
