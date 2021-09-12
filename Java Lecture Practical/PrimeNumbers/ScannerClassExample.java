import java.util.Scanner;
import java.util.Arrays;

public class ScannerClassExample {
    
    public static void main(String[] args) {
        
        int[] inputPrimes = new int[10];
        boolean[] prime = Seive(); // array with prime number index values as True
        int primeIndex = 0; // index value for storing prime number inputs
        
        Scanner myObj = new Scanner(System.in);
        int currentNum = 0;
        
        do {

            currentNum = myObj.nextInt();
            if(currentNum > 0 && prime[currentNum] == true) {

                inputPrimes[primeIndex] = currentNum;
                primeIndex += 1;
                
            }
            
        }  while(primeIndex != 10 && currentNum != -1);

        myObj.close();
        for(int index = 0; index < primeIndex; index++) {

            System.out.print(inputPrimes[index] + " ");
        }
    }

    public static boolean[] Seive() {

        int N = 100000;
        boolean [] prime = new boolean[N+1];
        Arrays.fill(prime, Boolean.TRUE);

        prime[0] = false;
        prime[1] = false;

        for(int number = 2; number <= Math.sqrt(N); number++) {

            if (prime[number] == true) {
                

                for(int next = number * number; next <= N; next += number ) {
                    
                    prime[next] = false;
                }
            }
        }

        return prime;
    }
}
