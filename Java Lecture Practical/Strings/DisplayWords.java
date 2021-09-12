
/**
 * DisplayWords
 */
public class DisplayWords {

    public static void main(String[] args) {
        
        String string = "Hello Roshan is world, This is Roshan";
        String word = "";
        int length = string.length();
        for(int index = 0; index < length; index++) {

            char ch = string.charAt(index);
            if(ch != ' ' && ch != '\t' && ch != '\n') {

                word += ch;
            }
            
            else {

                if(string.indexOf(word) == string.lastIndexOf(word))
                    System.out.println(word);
                word = "";
            }
        }
        if(word != "" && string.indexOf(word) == string.lastIndexOf(word)) 
            System.out.println(word);
    }
}