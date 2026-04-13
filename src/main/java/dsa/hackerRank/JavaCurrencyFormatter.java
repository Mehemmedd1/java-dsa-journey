package dsa.hackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inFormat=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        String china = chFormat.format(payment);
        String france = frFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
