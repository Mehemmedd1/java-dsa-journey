package dsa.hackerRank;

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");

        }else {
            System.out.println("No");
            }
        String upperCaseA = A.substring(0, 1).toUpperCase();
        String upperCaseB = B.substring(0, 1).toUpperCase();
        System.out.println(upperCaseA + A.substring(1) + " " + upperCaseB + B.substring(1));


    }
}
