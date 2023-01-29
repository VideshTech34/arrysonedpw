package arrayspw;


class Hello{
	
	void demoarray() {
		
		int a[] = {4,5,6,5,5};
		int count =0;
		
		int x =9;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==x) {
				count=count+1;
			}
		}
		
		System.out.println(count);
	}
}
public class OccurenceOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h1 = new Hello();
		
		h1.demoarray();

	}

}
