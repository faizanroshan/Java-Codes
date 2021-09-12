public class Array2 {

    public static void main(String[] args) {
        
        int length = args.length;
        int[] array = new int[length];
        float sum = 0;
        float average = 0;
        for(int index = 0; index < length; index++) {

            array[index] = Integer.parseInt(args[index]);
            sum += array[index];
        }
        average = sum / length;
        System.out.println("Sum: " + sum + "\n" + "Average: " + average);

        for(int i : array){

            System.out.print(i + " ");
        }

    }
}  
