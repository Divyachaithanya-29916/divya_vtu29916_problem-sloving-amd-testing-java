import java.util.Scanner;

class  PalindromeNumber{
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PalindromeNumber obj = new PalindromeNumber();

        if (obj.isPalindrome(num)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }

        sc.close();
    }
}
