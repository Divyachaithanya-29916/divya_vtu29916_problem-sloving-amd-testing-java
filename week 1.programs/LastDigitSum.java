import java.util.Scanner;

public class LastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int lastDigit1 = Math.abs(num1) % 10;
        int lastDigit2 = Math.abs(num2) % 10;

        int sum = lastDigit1 + lastDigit2;

        System.out.println("Sum of last digits: " + sum);

        sc.close();
    }
}
