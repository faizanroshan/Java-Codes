import java.io.*;

/*
// These below mentioned three packages are required for BufferedReader
// Also called as wrapped code.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/
public class BufferedReaderTest{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String example = reader.readLine();
        System.out.print(example);
    }
}
