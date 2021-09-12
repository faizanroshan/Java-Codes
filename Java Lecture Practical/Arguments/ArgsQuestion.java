public class ArgsQuestion {
    
    public static void main(String[] args) {
        
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;
        int length = args.length;
        int[] array = new int[length];

        for(int index = 0; index < length; index++) {

            array[index] = Integer.parseInt(args[index]);
            sum += array[index];
        }

        for(int index = 0; index < length; index++) {

            if(array[index] < minimum) {

                minimum = array[index];
            }
            if(array[index] > maximum) {

                maximum = array[index];
            }
        }

        System.out.println((sum - minimum) + " 9 out of 10 to get maximum sum");
        System.out.println((sum - maximum) + " 9 out of 10 to get minimum sum");
    }
}
