package yuanqi;

public class Selection extends Partition{

    /**
     * Keeps track of what subarray, a[left], ..., a[right], should be searched
     * @param a
     * @param k
     * @param left
     * @param right
     * @return the k-((middle)-left)-1th smallest element in an array segment a[(middle)+1], ...,a[right]
     */
	public static int selectHelper (int a[], int k, int left, int right) {

	    // if only one element
		if(right - left == 0) {
			return a[right];
		}

		// rearranges array into a[left] ... a[(middle)] ... a[right]
		int middle = partition(a,left, right);

		// stop when desired element is found
		if(k == (middle-left+1)) {
			return a[middle];
		}

		// recurse
		else if(k <= (middle-left)) {
		
			return selectHelper(a,k,left,middle-1);
		}
		    // recurse
			return selectHelper(a,k - (middle - left) - 1,middle+1,right);
	}

    /**
     * Uses the selectHelper and Partition methods to find the kth smallest element in an array a
     * @param a
     * @param k
     * @return the kth smallest element in an array a
     */
	public static int select(int a[], int k) {
	    // calls selectHelper with the proper starting values
		return selectHelper (a, k, 0, a.length-1);
	}

    /**
     * Finds the median element in an array a
     * @param a
     * @return median element
     */
	public static int median(int a[]) {
		return select(a, (a.length/2));
	}

	public static void main(String arg[]) {
        int a[] = {4, 3, 1, 6, 2, 5, 3, 2};
        System.out.println("The element is: " + select(a, 4));
        System.out.println("The median is: " + median(a));

        int a2[] = {2, 5, 2, 5, 7, 1, 3};
        System.out.println("The element is: " + select(a2, 1));
        System.out.println("The median is: " + median(a2));
    }
}
