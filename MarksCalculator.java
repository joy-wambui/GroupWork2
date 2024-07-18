import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        calculateAverageMarks();
    }

    public static void calculateAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Java Programming:");
        int javaMarks = scanner.nextInt();

        System.out.println("Enter marks for Networking:");
        int networkingMarks = scanner.nextInt();

        System.out.println("Enter marks for Maths:");
        int mathsMarks = scanner.nextInt();

        int totalMarks = javaMarks + networkingMarks + mathsMarks;
        double averageMarks = totalMarks / 3.0;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        scanner.close();
    }
}