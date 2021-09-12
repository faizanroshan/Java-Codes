public class IgnoreBetween {
    
    public static void main(String[] args) {
        
        int[] array = {6, 7, 6, 1, 2, 3, 4, 5, 6, 7};
        int length = array.length;

        int lowerBound = 6;
        int upperBound = 7;
        int sum = 0;
        int ignoredSum = 0;
        boolean flag = false;
        
        for(int index = 0; index < length; index++) {

            if(array[index] == lowerBound) {

                flag = true;
            } 

            if(flag == true) {

                ignoredSum += array[index];
            }
            if(flag == false){

                sum += array[index];
            }

            if(array[index] == upperBound) {

                flag = false;
            }
        }
        if(flag == true) {

            sum += ignoredSum;
        }
        System.out.println(sum);
    }
}
