package lesson4;

public class MissingInteger {
    private static final int LENGTH = 100000;
    public int solution(int[] A) {
        int[] positiveValues = new int[LENGTH];
        for (int i = 0; i < A.length; ++ i) {
            if (A[i] > 0 && A[i] - 1 < LENGTH) {
                positiveValues[A[i] - 1] = 1;
            }
        }
        int missingValue = LENGTH + 1;
        for (int i = 0; i < LENGTH; i ++) {
            if (positiveValues[i] == 0) {
                missingValue = i + 1;
                break;
            }
        }
        
        return missingValue;
    }
}
