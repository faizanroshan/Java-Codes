public class LinearSearch {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 5, 111, 23, 44, 55};
        int toSearch = 4;
        int length = arr.length;
        int result = -1;
        for(int index = 0; index < length; index++) {

            if(toSearch == arr[index]) {

                result = index;
                break;
            }
        }
        System.out.print(toSearch + " is at index: " + result);
    }
}
