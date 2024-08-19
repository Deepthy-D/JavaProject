import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {    
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter value = ");
            int number=scanner.nextInt();
                
                if (isPrime(number)) 
                {
                    System.out.println(number + " is a prime number.");
                } else {
                    
                    System.out.println(number + " is not a prime number.");
                }
        }
        }

        public static boolean isPrime(int number) {
            // Handle special cases
            if (number <= 1) {
                return false;
            }
            if (number == 2) {
                return true; 
            }
            if (number % 2 == 0) {
                return false; 
            }

           {
                for (int i = 3; i <= number/2; i += 2) {
                if (number % i == 0) {
                    return false; 
                }
            }

            return true;
        }
    }