public class MathOperation {

    private int num1;
    private int num2;

    // Constructor to initialize the instance variables
    public MathOperation(int number1, int number2) {
        this.num1 = number1;
        this.num2 = number2;
    }

    // Non-static method to calculate the sum of two numbers
    public int calculateSum() {
        return num1 + num2;
    }

    // Static method to calculate the absolute difference between two numbers
    public static int calculateAbsoluteDifference(int number1, int number2) {
        return Math.abs(number1 - number2);  // Use Math.abs for absolute value
    }

    // Static method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Create an object of MathOperations
        MathOperation operation = new MathOperation(5, 10);

        // Call non-static method to calculate sum
        int sum = operation.calculateSum();
        System.out.println("The sum of " + operation.num1 + " and " + operation.num2 + " is: " + sum);

        // Call static methods with different arguments
        int difference = MathOperation.calculateAbsoluteDifference(12, -7);
        System.out.println("The absolute difference between 12 and -7 is: " + difference);

        boolean isEvenNumber = MathOperation.isEven(20);
        System.out.println("Is 20 an even number? " + isEvenNumber);
    }
}
