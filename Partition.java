====	//System.out.println(middle);
>>>>>>> f5a9813dc13ddea5ef2453ea00e4b8d378f2aaab
		return middle;
	}
   
	public static void main(String arg[]) {

		//Test 1: random array of data
		int data[] = {4,3,1,6,2,5,3,2};
<<<<<<< HEAD
		int data2[] = {100, 0, -20};
		partition(data2);
		//System.out.println("middle: "+partition(data2));
=======
		System.out.println("middle index: "+partition(data,0,7));
		for(int i=0; i<8; i++) {
			System.out.println("data: "+ data[i]); 
		}
		
		//Test 2: test avoiding l_left out of bound 
		int data2[] = {100, 0, -20};
		System.out.println("middle index: "+partition(data2,0,2));
>>>>>>> f5a9813dc13ddea5ef2453ea00e4b8d378f2aaab
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
			System.out.println("data4: "+ data5[i]); 
		}
		
		

	}



}
