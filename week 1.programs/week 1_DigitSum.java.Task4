import java.util.Scanner;

public class DigitSum {

    public static int digitSum(int n, String opt) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (opt.equalsIgnoreCase("even") && digit % 2 == 0) {
                sum += digit;
            } 
            else if (opt.equalsIgnoreCase("odd") && digit % 2 != 0) {
                sum += digit;
            }

            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter option (even/odd): ");
        String opt = sc.next();

        int result = digitSum(n, opt);

        System.out.println("Sum of " + opt + " digits: " + result);

        sc.close();
    }
}
