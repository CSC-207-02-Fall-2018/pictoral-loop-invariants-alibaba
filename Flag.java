package yuanqi;

public class Flag {

	public static void dutch(String a[]) {

		int red = 0;
		int white = 0;
		int blue = a.length-1;

		//The case when there is not element in the array.
		if(a.length == 0) {
			System.out.println("Error: Empty array!");
		}

		while(white<=blue) {
			//System.out.println("B: "+blue);
			if(a[white].equals("Blue")) {
				String temp = a[blue];
				a[blue]=a[white];
				a[white]=temp;
				blue--;

				//System.out.println("B: "+blue);
			}

			else if(a[white].equals("Red")) {
				String temp = a[white];
				a[white]=a[red];
				a[red]=temp;
				red++;
				white++;
			}

			else if(a[white].equals("White")) {
				white++;
			}		
		}

	}

	public static void dutch2(String a[]) {
		int red = 0;
		int white = a.length-1;
		int blue = a.length-1;


		while(white>=red) {
			if(a[white].equals("Red")) {
				String temp = a[white];
				a[white] = a[red];
				a[red]=temp;
				red++;
			}

			else if(a[white].equals("Blue")) {
				String temp = a[white];
				a[white] = a[blue];
				a[blue]=temp;
				blue--;
				white--;
			}

			else if(a[white].equals("White")) {
				white--;
			}


		}
	}


	

	public static void main(String args[]) {
		String colors[]= {"Red","Blue", "White", "White", "Blue", "Red", "Red"};

		dutch2(colors);

		for(int i=0; i<colors.length; i++) {
			System.out.println(colors[i]);
		}

	}
	 
}
