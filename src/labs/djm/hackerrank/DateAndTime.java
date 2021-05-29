package labs.djm.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

class Result {
    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().name();
    }
}
class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);

    }

}
