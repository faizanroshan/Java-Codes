public class Palindrome {
    
    public static void main(String[] args) {
        
        String string = "lllaaalll";
        int length = string.length();

        for(int front = 0, rear = length-1; front < rear; front++, rear--) {

            if(string.charAt(front) != string.charAt(rear)) {

                System.out.println("It is not a palindrome");
                return;
            }
        }

        System.out.println("It is a palindrome");
    }
}
