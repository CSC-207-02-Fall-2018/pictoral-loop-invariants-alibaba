package yuanqi;

/**
 * Selection class select the kth smallest element in a specific 
 * array. It has two main methods: select and median, and a helper
 * method selecteHelper. Median is a special case of select, when
 * k=length/2. 
 * @author Govind
 * @author Yuanqi 
 *
 */

public class Selection extends Partition{

	/**
	 * Find the kth smallest element in the array and 
	 * keeps track of what subarray, a[left], ..., a[right], should be searched
	 * @param a		the array we choose the element from
	 * @param k		the kth smallest element 
	 * @param left	the start index of the subarray which needs to be sorted 
	 * @param right		the end index of the subarray which needs to be sorted
	 * @return the kth smallest element in an array.
	 */
	public static int selectHelper (int a[], int k, int left, int right) {

		//The case when there is not element in the array.
		if(a.length == 0) {
			System.out.println("Error: Empty array!");
			return 0;
		}

		else {
			// if only one element in the array
			if(right - left == 0) {
				return a[right];
			}

			// sorts the array
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
	}


	/**
	 * Uses the selectHelper and Partition methods to find the kth smallest element in an array a
	 * @param a  the array we choose the element from
	 * @param k   the kth smallest element
	 * @return the kth smallest element in an array a
	 */
	public static int select(int a[], int k) {
		// calls selectHelper with the proper starting values
		return selectHelper (a, k, 0, a.length-1);
	}


	/**
	 * Finds the median element in an array a.
	 * When the length of the array is even, we round it to the
	 * lower one to be the median.
	 * @param a		the array of interest
	 * @return median element
	 */
	public static int median(int a[]) {


		return select(a, (a.length/2));
	}

	public static void main(String arg[]) {
		//Test random array with even number of elements
		int a[] = {4, 3, 1, 6, 2, 5, 3, 2};
		System.out.println("The element is: " + select(a, 4));
		System.out.println("The median is: " + median(a));

		//Test random array with odd number of elements
		int a2[] = {2, 5, 2, 5, 7, 1, 3};
		System.out.println("The element is: " + select(a2, 1));
		System.out.println("The median is: " + median(a2));

		//Test right side out of bound exception handling
		int a3[] = {5,4,3,2};
		System.out.println("The element is: " + select(a3, 2));
		System.out.println("The median is: " + median(a3));

		//Test left side out of bound exception handling
		int a4[] = {2,3,4,5};
		System.out.println("The element is: " + select(a4, 4));
		System.out.println("The median is: " + median(a4));


		//Test selection with empty array
		int a5[]= {};
		select(a5,2);
		median(a5);

	}
}
