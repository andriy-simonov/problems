package lesson4;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int minValue = A[0];
        int maxValue = A[0];
        for (int i = 1; i < A.length; ++ i) {
            minValue = A[i] < minValue ? A[i] : minValue;
            maxValue = A[i] > maxValue ? A[i] : maxValue;
        }
        
        if (maxValue != A.length) {
            return 0;
        }
        
        int isPermutation = 1;
        int length = maxValue - minValue + 1;
        int[] arrayOfCounters = new int[length];
        for (int i = 0; i < length; ++ i) {
            if (arrayOfCounters[A[i] - minValue] > 0) {
                isPermutation = 0;
                break;
            }
            else {
                arrayOfCounters[A[i] - minValue] += 1;
            }
        }
        
        return isPermutation;
    }
}
