public class CompareStrings {
    
    public static void main(String[] args) {
        
        // compare method of Strings

        String s1 = "Roop";
        String s2 = "Yeshawanth";
        String s3 = "roop";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}
