package arrayspw;

class Section {
	
	void search() {
		
		
		
		int arr[] = {24,55,3,52,55,77,55};
		int count =0;
		int x =55;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		
		System.out.println("Index value of "+x+" is "+count);
		
	}
	
	
}

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Section a1 = new Section();
		a1.search();

	}

}
