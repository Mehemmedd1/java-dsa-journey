package dsa.hackerRank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i=3;
        int j =0;
        String smallest = S.substring(0,3);
        String largest = S.substring(0,3);

        while (i != S.length() + 1) {

            String a = S.substring(j, i);

            if (a.compareTo(smallest) < 0) {
                smallest = a;
            }

            if (a.compareTo(largest) > 0) {
                largest = a;
            }
            i++;
            j++;

        }

    }
}
