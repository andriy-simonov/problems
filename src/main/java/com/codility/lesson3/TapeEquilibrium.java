package com.codility.lesson3;

public class TapeEquilibrium {
    public int solution(int[] A) {
        long leftPart = A[0];
        long rightPart = 0;
        for (int i = 1; i < A.length; ++ i) {
            rightPart += A[i];
        }
        
        long minAbsoluteDifference = calculateDifference(leftPart, rightPart);
        for (int i = 2; i < A.length; ++ i) {
            leftPart += A[i - 1];
            rightPart -= A[i - 1];
            long difference = calculateDifference(leftPart, rightPart);
            minAbsoluteDifference = difference < minAbsoluteDifference ? difference : minAbsoluteDifference;
        }
        
        return (int) minAbsoluteDifference;
    }
    
    private long calculateDifference(long leftPart, long rightPart) {
        return leftPart - rightPart > 0 ? leftPart - rightPart : - (leftPart - rightPart);
    }
}
