import java.util.Arrays;
import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input K value
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid K value");
        } else {
            // Sort the array
            Arrays.sort(arr);

            // Kth smallest element
            System.out.println("The " + k + "th smallest element is: " + arr[k - 1]);
        }

        sc.close();
    }
}
