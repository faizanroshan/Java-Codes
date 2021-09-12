/**
 * TotalMarksBF
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TotalMarksBF {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter number of subjects: ");
        int subjects = Integer.parseInt(reader.readLine());

        float total = 0;
        for(int subject = 1; subject < subjects + 1; subject++ ){

            System.out.print("Enter subject " + subject + " marks: ");
            total += Float.parseFloat(reader.readLine());
            
        } 
        System.out.println("total marks: " + total);
        System.out.println("average marks: " + total / subjects);
    }
}