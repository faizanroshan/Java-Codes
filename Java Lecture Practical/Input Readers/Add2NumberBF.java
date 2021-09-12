import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Add2NumberBF {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println("Sum of two numbers: " + (num1 + num2));
    }
}
