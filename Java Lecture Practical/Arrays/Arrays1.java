public class Arrays1 {
    
    public static void main(String[] args) {
        
        int[] ascii = {65, 66, 77, 80};
        int length = ascii.length;
        for(int index = 0; index < length; index++) {

            System.out.print((char)ascii[index] + " ");
        }

        char[] symbols = {'+', '-', '*', '/'};
        int[] asciiValues = new int[4];
        int symbols_length = symbols.length;

        for(int index = 0; index < symbols_length; index++) {

            asciiValues[index] = (int)symbols[index];
        }
        for(int index = 0; index < symbols_length; index++) {

            System.out.print( "\n" + symbols[index] +  " " + asciiValues[index] + " ");
        }
    }
}
