package dsa.hackerRank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i=1;
        while(reader.hasNextLine()){
            System.out.println(i+" "+reader.nextLine());
            i++;
        }
        reader.close();
    }
}
