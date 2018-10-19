package yuanqi;

public class Partition {

    /**
     * Rearranges the elements of a between a[left] and a[right],
     *      so that one array element has moved to the place it
     *      would belong in a sorted array
     * @param a
     * @param left
     * @param right
     * @return the middle element of the array
     */
	public static int partition(int a[], int left, int right) {
	    //initializing variables
		int l_spot=left;
		int r_spot=right;
		int middle =0;

		// runs until r_spot and l_spot come together
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

        // placing a[left] in its appropriate position a[middle]
		int temp1 = a[l_spot];
		a[l_spot]= a[left];
		a[left]= temp1;

		middle = l_spot;

		return middle;
	}

	public static void main(String arg[]) {

		//Test 1: random array of data
		int data[] = {4,3,1,6,2,5,3,2};
		System.out.println("middle index: "+partition(data,0,7));
		for(int i=0; i<8; i++) {
			System.out.println("data: "+ data[i]); 
		}
		
		//Test 2: test avoiding l_left out of bound 
		int data2[] = {100, 0, -20};
		System.out.println("middle index: "+partition(data2,0,2));
		for(int i=0; i<3; i++) {
			System.out.println("data2: "+ data2[i]); 
		}
		
		//Test 3: Other left and right to start with
		int data3[] = {4,3,1,6,2,5,3,2};
		System.out.println("middle index: "+partition(data3,3,6));
		for(int i=0; i<8; i++) {
			System.out.println("data3: "+ data3[i]); 
		}
		
		//Test 4: test avoiding r_left out of bound 
		int data4[] = {200,-20, 0, 100};
		System.out.println("middle index: "+partition(data4,0,3));
		for(int i=0; i<4; i++) {
			System.out.println("data4: "+ data4[i]); 
		}
		
        
		int data5[] = {3,3,1,2,2};
		System.out.println("middle index: "+partition(data5,0,4));
		for(int i=0; i<5; i++) {
			System.out.println("data5: "+ data5[i]);
		}
		
		

	}



}
