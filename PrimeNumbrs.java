public class PrimeNumbrs {

    /**
     * This method checks if a given number is prime.
     * A prime number is only evenly divisible by 1 and itself.
     * @param number The integer to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 or less are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 or itself
            }
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
