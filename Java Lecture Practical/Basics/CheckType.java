public class CheckType {
    
    public static void main(String[] args) {
        
        char var = '@';
        int val = (int)var;

        if( (val >= 65 && val <= 91) || (val >= 97 && val <= 123))
            System.out.println("Alphabet");
        else if (val >= 48 && val <= 57)
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
