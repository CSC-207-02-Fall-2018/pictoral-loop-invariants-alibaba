package yuanqi;

public class Partition {


	public static int partition(int[] data) {

		int left=0;
		int right=data.length -1;
		int l_spot=left;
		int r_spot=right;
		int middle =0;

		while(r_spot >= l_spot ) {

			while(data[r_spot]>=data[left] && r_spot>=left) {
				
					r_spot--;
				System.out.println("r" +data[r_spot]);
			}

			while(data[l_spot]<=data[left] && l_spot<=data.length-1) {
			
					l_spot++;
					System.out.println("l" + data[l_spot]);
			}


			if(r_spot>=l_spot) {
				int temp = data[r_spot];
				data[r_spot]= data[l_spot];
				data[l_spot]=temp;
			}
		}


		int temp1 = data[r_spot];
		data[r_spot]= data[left];
		data[left]= temp1;


		middle = r_spot;

		return middle;
	}

	public static void main(String arg[]) {

		int data[] = {4,3,1,6,2,5,3,2};
		int data2[] = {0, -20, 100};
		partition(data2);
		//System.out.println("middle: "+partition(data2));
		for(int i=0; i<3; i++) {

			System.out.println("data: "+ data2[i]); 
		}

	}



}