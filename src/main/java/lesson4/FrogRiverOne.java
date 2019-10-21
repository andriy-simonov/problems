package lesson4;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int[] auxiliaryArray = new int[X];
        
        int time = -1;
        int count = 0;
        int i;
        for (i = 0; i < A.length; ++ i) {
            if (auxiliaryArray[A[i] - 1] == 0) {
                count += 1;
            }
            if (count == X) {
                time = i;
                break;
            }
            auxiliaryArray[A[i] - 1] += 1;
        }
        
        return time;
    }
}
