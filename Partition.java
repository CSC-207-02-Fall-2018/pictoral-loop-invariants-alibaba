package yuanqi;

public class Partition {


	public static int partition(int[] data) {

		//Declarations
		int left=0;
		int right=data.length -1;
		int l_spot=left;
		int r_spot=right;
		int middle =0;

		//loop through every elements in the data array
		while(r_spot >= l_spot ) {

			//find the items larger than the pivot point
			while(r_spot>=left && data[r_spot]>=data[left]) {
				
					r_spot--;
			}

			//find the items smaller than the pivot point
			while(l_spot<=data.length-1 && data[l_spot]<=data[left]) {
			
					l_spot++;

			}

			/*swap smaller elements to the left and larger
			 elements to the right*/
			if(r_spot>=l_spot) {
				int temp = data[r_spot];
				data[r_spot]= data[l_spot];
				data[l_spot]=temp;
			}
		}


		/*swap the pivot point to the middle where
		 elements to the left of the pivot is smaller than the pivot;
		 elements to the right of the pivot is larger than the pivot.*/
		int temp1 = data[r_spot];
		data[r_spot]= data[left];
		data[left]= temp1;


		middle = r_spot;

		//return the index where are defined as middle of the array
		return middle;
	}

	public static void main(String arg[]) {

		int data[] = {4,3,1,6,2,5,3,2};
		int data2[] = {100, 0, -20};
		partition(data2);
		//System.out.println("middle: "+partition(data2));
		for(int i=0; i<3; i++) {

			System.out.println("data: "+ data2[i]); 
		}

	}



}
