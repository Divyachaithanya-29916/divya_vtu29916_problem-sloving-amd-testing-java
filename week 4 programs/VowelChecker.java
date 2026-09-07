import java.util.Scanner;

public class VowelChecker {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int half = s.length() / 2;
        int firstCount = 0;
        int secondCount = 0;

        
        for (int i = 0; i < half; i++) {
            if (isVowel(s.charAt(i))) {
                firstCount++;
            }
        }

        
        for (int i = half; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                secondCount++;
            }
        }

        
        if (firstCount == secondCount) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}