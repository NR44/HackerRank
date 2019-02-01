package javaLoops2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    private static void generateSeries(ArrayList<Integer> list, int a, int b, int n, int i) {
        if (n > 0) {
            System.out.println(list.size());
            if (list.size() == 0)
                list.add(a + b);
            else list.add(list.get(list.size() - 1) + i * b);

            System.out.print(String.format("%d ", list.get(list.size() - 1)));
            generateSeries(list, a, b, n - 1, i * 2);
        } else {
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queryNum = in.nextInt();
        ArrayList<Integer> results = new ArrayList<>();

        IntStream.range(0, queryNum)
                .forEach(x -> {
                            int a = in.nextInt();
                            int b = in.nextInt();
                            int n = in.nextInt();
                            generateSeries(results, a, b, n, 1);
                            results.clear();
                        }
                );
    }
}
