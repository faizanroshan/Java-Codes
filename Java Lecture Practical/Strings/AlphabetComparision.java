/**
 * Alphabet Comparision
 */
public class AlphabetComparision {

    public static void main(String[] args) {
        
        char first = 'B';
        char second = 'a';

        char firstT = first;
        char secondT = second;

        if(first > 96) 
            firstT = (char)((int)first - 32);

        if (second > 96)
            secondT = (char)((int)second - 32);
        
        if(firstT <= secondT) 
            System.out.println(first + " " + second);
        else
            System.out.println(second + " " + first);
    }
}