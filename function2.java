public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Edge cases for numbers less than 2
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime
    }

    public static void main(String[] args) {
        int num = 17;

        // Check if the number is prime and print the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
