package yuanqi;

/**
 * Partition class rearranges the elements of a between a[left] and a[right], 
 * so that one array element has moved to the place it would belong in a sorted array
 * by having a method partition(int a[], int left, int right). 
 * @author Govind
 * @author Yuanqi 
 *
 */
public class Partition {

	/**
	 * Rearranges the elements of a between a[left] and a[right],
	 *      so that one array element has moved to the place it
	 *      would belong in a sorted array.
	 * @param a		the array needs to be sorted
	 * @param left	the start index of the subarray which needs to be sorted 
	 * @param right		the end index of the subarray which needs to be sorted
	 * @return the index of chosen middle point of the array
	 */
	public static int partition(int a[], int left, int right) {
		//initializing variables
		int l_spot=left;
		int r_spot=right;
		int middle =0;

		//The case when there is not element in the array.
		if(a.length == 0) {
			System.out.println("Error: Empty array!");
			return 0;
		}
		else {

			// runs until r_spot surpasses l_spot
			while(r_spot > l_spot) {

				while(r_spot!=l_spot && r_spot>left && a[r_spot]>=a[left]) {
					r_spot--;

				}

				while(l_spot!=r_spot && l_spot<=right && a[l_spot]<=a[left]) {
					l_spot++;

				}
				//swapping l_spot and r_spot
				int temp = a[r_spot];
				a[r_spot]= a[l_spot];
				a[l_spot]=temp;
			}

			// placing a[left] in its appropriate position middle
			int temp1 = a[l_spot];
			a[l_spot]= a[left];
			a[left]= temp1;

			middle = l_spot;

			return middle;
		}
	}

	public static void main(String arg[]) {

		//Test 1: random array of data
		int data[] = {4,3,1,6,2,5,3,2};
		//Expected Output: middle index should be 5.
		System.out.println("middle index: "+partition(data,0,7));
		for(int i=0; i<8; i++) {
			System.out.println("data: "+ data[i]); 
		}

		//Test 2: test avoiding l_left out of bound 
		int data2[] = {100, 0, -20};
		//Expected Output: middle index should be 2.
		System.out.println("middle index: "+partition(data2,0,2));
		for(int i=0; i<3; i++) {
			System.out.println("data2: "+ data2[i]); 
		}

		//Test 3: Other left and right to start with
		int data3[] = {4,3,1,6,2,5,3,2};
		//Expected Output: middle index should be 6.
		System.out.println("middle index: "+partition(data3,3,6));
		for(int i=0; i<8; i++) {
			System.out.println("data3: "+ data3[i]); 
		}

		//Test 4: test avoiding r_left out of bound 
		int data4[] = {200,-20, 0, 100};
		//Expected Output: middle index should be 3.
		System.out.println("middle index: "+partition(data4,0,3));
		for(int i=0; i<4; i++) {
			System.out.println("data4: "+ data4[i]); 
		}


		int data5[] = {3,3,1,2,2};
		//Expected Output: middle index should be 4.
		System.out.println("middle index: "+partition(data5,0,4));
		for(int i=0; i<5; i++) {
			System.out.println("data5: "+ data5[i]);
		}

		//Test with empty array
		int a6[]= {};
		partition(a6,0,3);



	}



}
