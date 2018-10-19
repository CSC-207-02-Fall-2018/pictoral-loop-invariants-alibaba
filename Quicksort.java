package yuanqi;


public class Quicksort extends Partition{

	 public static void quicksortKernel (int a[], int left, int right) {
		if(right > left) {
			int middle = partition(a,left,right);
			quicksortKernel(a,left,middle-1);
			quicksortKernel(a,middle+1,right);
		}
	 }

    /**
     * Applies partition recursively, until subintervals have no more than one element (and thus are already sorted)
     * @param a
     */
	 public static void quicksort (int a[]){
         quicksortKernel (a, 0, a.length-1);
      }
	 
	 
	 public static void main(String arg[]) {
		 //Test quicksort with a random array
         int a[]= {2,4,1,5,2,5,8,0};
		 quicksort(a);
		 for(int i=0; i<a.length; i++) {
			 System.out.println("a: " + a[i]);
		 }
         
         //Test quicksort with a ascending sorted array
         int a2[]= {2,3,4,5};
         quicksort(a2);
         for(int i=0; i<a2.length; i++) {
             System.out.println("a2: " + a2[i]);
         }
         
         //Test quicksort with a descending sorted array
         int a3[]= {5,4,3,2};
         quicksort(a3);
         for(int i=0; i<a3.length; i++) {
             System.out.println("a3: " + a3[i]);
         }
         
	 }
	 
	
}
