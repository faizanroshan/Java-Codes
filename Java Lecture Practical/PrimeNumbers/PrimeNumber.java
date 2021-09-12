public class PrimeNumber {
    
    public static void main(String[] args) {
        
        int num = 2;

        if(num == 0 || num == 1) {
            System.out.println("Neither composite Nor Prime!");
            return;
        }
        else if(num == 2) {

            System.out.println("It is a prime");
            return;
        }
        else if(num % 2 == 0) {

            System.out.println("It isn't a prime!");
            return;
        }

        for(int i = 3; i <= Math.sqrt(num); i+=2) {

            if(num % i == 0) {

                System.out.print("It isn't a prime !");
                return;
            
            }

        }
        System.out.println("It is a prime !");

    }
}
