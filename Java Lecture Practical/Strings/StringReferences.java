public class StringReferences {
    
    public static void main(String[] args) {
        
        // Priortize equals method over '==' when comparing strings.
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
    }
}
