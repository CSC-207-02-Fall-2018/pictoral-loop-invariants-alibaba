package yuanqi;

/**
 * Flag is a class that sorts an array of "red", "white" and "blue" strings to resemble Dutch National Flag
 * @author govind
 * @author yuanqi
 */
public class Flag {

    /** First implementation of Dutch National Flag (Implementation B)
     * Sorts an array a of "red", "white" and "blue" strings to resemble Dutch National Flag
     * @param a   an array of "red", "white" and "blue" strings
     */
    public static void dutch(String a[]) {
        // initializing variables
        int red = 0;
        int white = 0;
        int blue = a.length-1;

        //The case when there is not element in array.
        if(a.length == 0) {
            System.out.println("Error: Empty array!");
        }

        // runs until white index > blue index
        while(white<=blue) {
            //System.out.println("B: "+blue);
            if(a[white].equals("Blue")) {
                String temp = a[blue];
                a[blue]=a[white];
                a[white]=temp;
                blue--;

                //System.out.println("B: "+blue);
            }

            // if color red is found
            else if(a[white].equals("Red")) {
                String temp = a[white];
                a[white]=a[red];
                a[red]=temp;
                red++;
                white++;
            }

            // if white is found move white index right and do nothing else
            else if(a[white].equals("White")) {
                white++;
            }
        }
    }

    /** Second implementation of Dutch National Flag (Implementation C)
     * Sorts an array a of "red", "white" and "blue" strings to resemble Dutch National Flag
     * @param a   an array of "red", "white" and "blue" strings
     */
    public static void dutch2(String a[]) {
        // initializing variables
        int red = 0;
        int white = a.length-1;
        int blue = a.length-1;

        //The case when there is not element in the array.
        if(a.length == 0) {
            System.out.println("Error: Empty array!");
        }

        // runs until white index < red index
        while(white>=red) {
            if(a[white].equals("Red")) {
                String temp = a[white];
                a[white] = a[red];
                a[red]=temp;
                red++;
            }

            // if color blue is found
            else if(a[white].equals("Blue")) {
                String temp = a[white];
                a[white] = a[blue];
                a[blue]=temp;
                blue--;
                white--;
            }

            // if white is found move white index left and do nothing else
            else if(a[white].equals("White")) {
                white--;
            }
        }
    }

    public static void main(String args[]) {

        // Testing first implementation (B)

        // Testing regular array
        String colors1[]= {"Red","Blue", "White", "White", "Blue", "Red", "Red"};
        dutch(colors1);
        for(int i=0; i<colors1.length; i++) {
            System.out.println(colors1[i]);     
        }
        System.out.println("\n");
        
        // Testing to see if variables stay in bounds
        String colors2[]= {"Red","Red", "White", "White", "Blue", "Blue"};
        dutch(colors2);
        for(int i=0; i<colors2.length; i++) {
            System.out.println(colors2[i]);
        }
        System.out.println("\n");
        
        // Testing to see if variables stay in bounds
        String colors3[]= {"Blue", "Blue", "Red","Red","White", "White"};
        dutch(colors3);
        for(int i=0; i<colors3.length; i++) {
            System.out.println(colors3[i]);
        }
        System.out.println("\n");
        
        // Testing empty array
        String colorsEmpty[]= {};
        dutch(colorsEmpty);
        for(int i=0; i<colorsEmpty.length; i++) {
            System.out.println(colorsEmpty[i]);
        }
        System.out.println("\n");


        // Testing second implementation (C)

        // Testing regular array
        String colors4[]= {"Red","Blue", "White", "White", "Blue", "Red", "Red"};
        dutch2(colors4);
        for(int i=0; i<colors4.length; i++) {
            System.out.println(colors4[i]);
        }
        System.out.println("\n");

        // Testing to see if variables stay in bounds
        String colors5[]= {"Red","Red", "White", "White", "Blue", "Blue"};
        dutch2(colors5);
        for(int i=0; i<colors5.length; i++) {
            System.out.println(colors5[i]);
        }
        System.out.println("\n");

        // Testing to see if variables stay in bounds
        String colors6[]= {"Blue", "Blue", "Red","Red","White", "White"};
        dutch2(colors6);
        for(int i=0; i<colors6.length; i++) {
            System.out.println(colors6[i]);
        }
        System.out.println("\n");

        // Testing empty array
        String colorsEmpty2[]= {};
        dutch2(colorsEmpty2);
        for(int i=0; i<colorsEmpty2.length; i++) {
            System.out.println(colorsEmpty2[i]);
        }
        System.out.println("\n");

    }

}
