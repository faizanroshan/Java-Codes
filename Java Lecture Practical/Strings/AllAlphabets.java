public class AllAlphabets {
    
    public static void main(String[] args) {
        
        boolean[] alphabetExist = new boolean[26];

        String string = "Farmer jack realized that big yellow quilts were expensive";
        string = string.toLowerCase();
        int length = string.length();

        for(int index = 0; index < length; index++) {

            char ch = string.charAt(index);
            if(ch != ' ') {

                alphabetExist[ch - 'a'] = true;
            }           
        }

        for(int index = 0; index < 26; index++) {

            if(alphabetExist[index] == false) {

                System.out.println("It doesn't contain all alphabets");
                return;
            }
        }
        System.out.println("It contains all alphabets");
    }
}
