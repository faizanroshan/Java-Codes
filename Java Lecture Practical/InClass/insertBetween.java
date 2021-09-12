public class insertBetween {
    
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        for(int index = 0; index < arr.length-1; index++) {

            if(index==4)
                arr[index] = 15;
            else
                arr[index] = index;
        }
        for(int i : arr) {

            System.out.print(i + " ");
        }
        int insertPosition = 4;
        int insertValue = 10;
        for(int index = arr.length-1; index != insertPosition; index--) {

            arr[index] = arr[index-1];
        }
        arr[insertPosition] = insertValue;
        
        System.out.print("\n");
        for(int i : arr) {

            System.out.print(i + " ");
        }
    }
}
