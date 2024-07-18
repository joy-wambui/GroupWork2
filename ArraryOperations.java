
import java.util.Scanner;

public class ArraryOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 15; // Define array size

        // Input and display values
        int[] numbers = new int[ARRAY_SIZE];
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nThe entered values are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Check for a number in the array
        System.out.println("\nEnter a number to search:");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                System.out.println("The number " + searchNumber + " found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Number " + searchNumber + " not found in this array");
        }

        // Reverse copy to another array
        int[] reversedNumbers = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            reversedNumbers[ARRAY_SIZE - i - 1] = numbers[i]; // Reverse order by copying from end
        }
        System.out.println("\nThe reversed elements are:");
        for (int number : reversedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Calculate sum and product
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
