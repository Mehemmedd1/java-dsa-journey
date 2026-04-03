package dsa.hackerRank;

import java.util.Calendar;
import java.util.Locale;


public class DateAndTime {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month-1, day);

        String displayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
                Locale.getDefault());

        return (displayName.toUpperCase());
    }

    public static void main(String[] args) {
        int month = 8;
        int day = 14;
        int year = 2017;
        String res = findDay(month, day, year);

        System.out.println(res);
    }

}
