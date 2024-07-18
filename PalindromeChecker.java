import java.awt.event.*;
import javax.swing.*;

public class PalindromeChecker extends JFrame implements ActionListener {

    private JTextField numberInput;
    private JButton checkButton;
    private JLabel resultLabel;

    public PalindromeChecker() {
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String numberStr = numberInput.getText();
        if (numberStr.isEmpty()) {
            resultLabel.setText("Please enter a number.");
            return;
        }
        int number = Integer.parseInt(numberStr);
        int reversedNumber = 0, remainder, originalNumber = number;
        // Reverse the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        // Check if palindrome
        if (originalNumber == reversedNumber) {
            resultLabel.setText(originalNumber + " is a palindrome.");
        } else {
            resultLabel.setText(originalNumber + " is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        new PalindromeChecker();
    }
}
