package endOfFile;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int lineNum = 1;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            System.out.println(String.format("%d %s",lineNum++, in.nextLine()));
        }
    }
}