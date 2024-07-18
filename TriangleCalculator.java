import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {
        TriangleCalculator calculator = new TriangleCalculator();
        calculator.calculateAndDisplayArea();
    }

    public void calculateAndDisplayArea() {
        double base = getBaseFromUser();
        double height = getHeightFromUser();

        double area = calculateArea(base, height);

        System.out.println("The area of the triangle is: " + area);
    }

    public double getBaseFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        scanner.close();
        return base;
    }

    public double getHeightFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        scanner.close();
        return height;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}