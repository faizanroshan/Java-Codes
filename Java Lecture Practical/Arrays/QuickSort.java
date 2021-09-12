import java.lang.reflect.Array;

public class QuickSort {
    
    public static void main(String[] args) {
        
        int[] arr = {10, 8, 12, 33, 45};
        quicksort(arr, 0, arr.length-1);

        for(int num : arr)
            System.out.print(num + " ");
    }

    public static int partition(int[] array, int start, int end) {

        int pivot = start;
        int low = start+1;
        int high = end;
        int temp;

        while (low < high) {

            while(low < array.length && array[low] <= array[pivot]) {

                low += 1;
            }
                      
            while(array[high] > array[pivot]) {
                
                high -= 1;
            }

            if(low < high) {

                temp = array[low];
                array[low] = array[high];
                array[high] = array[high];
            }
        }
        temp = array[pivot];
        array[pivot] = array[high];
        array[high] = temp;
        
        return high;
    }

    public static int[] quicksort(int[] arr, int start, int end) {

        if(start < end) {

            int partitionIndex = partition(arr, start, end);
            quicksort(arr, start, partitionIndex-1);
            quicksort(arr, partitionIndex+1, end);
        
        }

        return arr;
    }
}
