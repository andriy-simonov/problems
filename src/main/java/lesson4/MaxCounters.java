package lesson4;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxValue = 0;
        int offset = 0;
        boolean isModified = false;
        
        for (int i = 0; i < A.length; ++ i) {
            if (A[i] - 1 < counters.length) {
                counters[A[i] - 1] += 1;
                maxValue = counters[A[i] - 1] + offset > maxValue ? counters[A[i] - 1] + offset : maxValue;
                isModified = true;
            }
            else if (isModified) {
                counters = new int[N];
                offset = maxValue;
                isModified = false;
            }
        }
        for (int i = 0; i < N; ++ i) {
            counters[i] += offset;
        }
        
        return counters;
    }
}
