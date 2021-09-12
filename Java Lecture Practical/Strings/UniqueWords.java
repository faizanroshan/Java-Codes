import java.util.HashMap;
import java.util.Map;
public class UniqueWords {
    
    public static void main(String[] args) {
        
        String string = "java is easy and JAVA is also easy";
        String word = ""; 
        int length = string.length();
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int index = 0; index < length; index++){

            char ch = string.charAt(index);
            if(ch != ' ' && ch != '\t' && ch != '\n') {

                word += ch;
            }
            
            else {

                if(map.get(word) == null)
                    map.put(word, 1);
                else{

                    map.put(word, map.get(word) + 1);
                }

                word = "";
            }
        }
        // for the last word
        if(word != " " && map.get(word) == null)
            map.put(word, 1);
        else if(word != " ")
            map.put(word, map.get(word) + 1);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {

            if(entry.getValue() == 1) {

                System.out.println(entry.getKey());
            }
        }
    }
}
