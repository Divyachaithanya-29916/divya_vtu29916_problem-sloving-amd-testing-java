import java.util.Scanner;

class DayOfYear {

    public static int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29;
        }

        int dayNumber = day;
        for (int i = 0; i < month - 1; i++) {
            dayNumber += daysInMonth[i];
        }

        return dayNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        System.out.println(dayOfYear(date));

        sc.close();
    }
}