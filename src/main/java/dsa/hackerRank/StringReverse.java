package dsa.hackerRank;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String anagram1=sc.nextLine();
        String anagram2=sc.nextLine();
        if(anagram1.length() != anagram2.length()){
            System.out.println("Not Anagrams");
        }



    }
}
