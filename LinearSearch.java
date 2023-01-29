package arrayspw;

class Search{
	
	void demoArray() {
		
		int a[] = {5,3,7,9,4};
		
		int x =7;
		
		int ans=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				ans = i;
			}
		}
		
		System.out.println(x +  " :found at" + ans + " :Position");
	}
}

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search s1 = new Search();
		s1.demoArray();

	}

}
