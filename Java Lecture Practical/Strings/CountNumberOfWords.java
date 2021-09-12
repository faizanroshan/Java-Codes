public class CountNumberOfWords {
    public static void main(String[] args) {
        
        String string = "Hey Roshan how are you";
        int length = string.length();
        int count = 0;
        for(int index = 1; index < length; index++) {

            if(string.charAt(index) == ' ' && string.charAt(index-1) != ' ') 
                count += 1;
        }

        if(length > 2 && string.charAt(length-1) != ' ') {

            count += 1;
        }

        System.out.print(count);
    }
}
