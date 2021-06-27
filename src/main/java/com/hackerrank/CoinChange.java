package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class CoinChange {
    private long[][] memo;

    private long getWays(int n, List<Integer> c) {
        memo = new long[n + 1][c.size() + 1];
        for (long[] arr : memo)
            Arrays.fill(arr, -1);
        return getWays(n, c, 0);
    }

    private long getWays(int n, List<Integer> c, int i) {
        if (n == 0)
            return 1;

        long a = 0;
        long b = 0;
        if (i < c.size() && n - c.get(i) >= 0) {
            if (memo[n - c.get(i)][i] < 0)
                memo[n - c.get(i)][i] = getWays(n - c.get(i), c, i);
            a = memo[n - c.get(i)][i];
        }
        if (i + 1 < c.size()) {
            if (memo[n][i + 1] < 0)
                memo[n][i + 1] = getWays(n, c, i + 1);
            b = memo[n][i + 1];
        }
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = new CoinChange().getWays(n, c);

        System.out.println(ways);
        // bufferedWriter.write(String.valueOf(ways));
        // bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
