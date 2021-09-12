public class Vowels {

    public static void main(String[] args) {
        
        String word = "Roshan";
        int length = word.length();
        int count = 0;
        for(int index = 0; index < length; index++) {

            char ch = word.charAt(index)
            boolean condition = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' );
            if(condition) {

                count += 1;
            }
        }
        System.out.println("number of vowels: " + count);
    }
}