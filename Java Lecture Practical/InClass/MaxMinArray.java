public class MaxMinArray {
    
    public static void main(String[] args) {
        
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        
        int[] array = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = array.length;

        // for(int index = 0; index < length; index++) {

        //     array[index] = Integer.parseInt(args[index]);
        // }

        for(int index = 0; index < length; index++) {

            if(array[index] < minimum) {

                minimum = array[index];
            }
            if(array[index] > minimum && array[index] < secondMinimum) {

                secondMinimum = array[index];
            }
            if(array[index] > maximum) {

                maximum = array[index];
            }

            if(array[index] < maximum && array[index] > secondMaximum) {

                secondMaximum = array[index];
            }
        }

        System.out.println("minimum: " + minimum + " second minimum: " + secondMinimum);
        System.out.println("maximum: " + maximum + " second maximum: " + secondMaximum);
    }
}
