public class TimeConversion {

    public static String timeConversion(String s) {
        // Extract AM/PM
        String period = s.substring(s.length() - 2);  // "AM" or "PM"
        String time = s.substring(0, s.length() - 2); // "07:05:45"

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minutes = parts[1];
        String seconds = parts[2];

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;  // 12 AM → 00
            }
        } else { // PM
            if (hour != 12) {
                hour += 12;  // 1 PM → 13, 2 PM → 14, ..., 11 PM → 23
            }
            // 12 PM stays 12
        }

        // Format hour to always have 2 digits
        String hourStr = String.format("%02d", hour);

        return hourStr + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        // Sample Input 0
        String input1 = "07:05:45PM";
        System.out.println("Input : " + input1);
        System.out.println("Output: " + timeConversion(input1));
        System.out.println();

        // Extra test cases
        String input2 = "12:01:00PM";
        System.out.println("Input : " + input2);
        System.out.println("Output: " + timeConversion(input2));
        System.out.println();

        String input3 = "12:01:00AM";
        System.out.println("Input : " + input3);
        System.out.println("Output: " + timeConversion(input3));
        System.out.println();

        String input4 = "11:59:59PM";
        System.out.println("Input : " + input4);
        System.out.println("Output: " + timeConversion(input4));
    }
}