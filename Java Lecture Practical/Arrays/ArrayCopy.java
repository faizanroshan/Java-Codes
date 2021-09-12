public class ArrayCopy {
    
    public static void main(String[] args) {
        
        int[] source = {0, 10, 20, 30, 40};
        int[] destination = new int[3];

        System.arraycopy(source, 0, destination, 0, 3);
        for(int index = 0; index < 3; index++) {

            System.out.println(index + " " + destination[index]);
        }
        System.out.println(source);
        System.out.println(destination);
    }
}
