public class FibonacciSequence {

    /**
     * This method calculates the sum of even-valued terms in the Fibonacci sequence up to a given limit.
     * @param limit The maximum value for the Fibonacci sequence.
     * @return The sum of all even-valued terms in the sequence below the limit.
     */
    public static int sumEvenFibonacciTerms(int limit) {
        int sum = 0;
        int firstTerm = 0;
        int secondTerm = 2; // Start with the first even term (2)

        while (secondTerm < limit) {
            sum += secondTerm;
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return sum;
    }

    public static void main(String[] args) {
        int limit = 4000000; // limit
        int evenSum = sumEvenFibonacciTerms(limit);
        System.out.println("The sum of even-valued terms in the Fibonacci sequence below " + limit + " is: " + evenSum);
    }
}
// Fibonacci sequence is a series of numbers where each number is the sum of the two preceeding ones