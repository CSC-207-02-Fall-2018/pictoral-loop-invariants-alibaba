package yuanqi;

public class Selection extends Partition{

	
	public static int selectHelper (int a[], int k, int left, int right) {
		
		if(right - left == 0) {
			return a[right];
		}
		
		int middle = partition(a,left, right);

		
		if(k == (middle-left+1)) {
			return a[middle];
		}
		else if(k <= (middle-left)) {

		
			return selectHelper(a,k,left,middle-1);
		}
		
			return selectHelper(a,k - (middle - left) - 1,middle+1,right);
		
		
		
		
	}

	public static int select(int a[], int k) {
	 
		return selectHelper (a, k, 0, a.length-1);
	}
	
	
	public static int median(int a[]) {
		return select(a, (a.length/2));
	}
	
	
	
	public static void main(String arg[]) {
		int a[] = {4,3,1,6,2,5,3,2};
		System.out.println("The element is: "+ select(a,4));
		System.out.println("The median is: "+ median(a));
		
		int a2[] = {2,5,2,5,7,1,3};
		System.out.println("The element is: " + select(a2,1));
		System.out.println("The median is: "+ median(a2));
		
	}
}
