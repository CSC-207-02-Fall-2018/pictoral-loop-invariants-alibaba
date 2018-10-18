package yuanqi;

public class Quicksort extends Partition{

	
	 public static void quicksortKernel (int a[], int left, int right) {
		if(right > left) {
			int middle = partition(a,left,right);
			quicksortKernel(a,left,middle-1);
			quicksortKernel(a,middle+1,right);
		}
		
	
	 }
	
	 
	 public static void quicksort (int a[]){
         quicksortKernel (a, 0, a.length-1);
      }
	 
	 
	 public static void main(String arg[]) {
		 int a[]= {2,4,1,5,2,5,8,0};
		 quicksort(a);
		 for(int i=0; i<a.length; i++) {
			 System.out.println("a: " + a[i]);
		 }
	 }
	 
	
}
