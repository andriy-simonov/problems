package com.codility.lesson2;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] rotatedArray;
        if (A.length == 0) {
            rotatedArray = new int[0];
        }
        else {
            rotatedArray = new int[A.length];
            int k = K % A.length;
            
            System.arraycopy(A, 0, rotatedArray, k, A.length - k);
            System.arraycopy(A, A.length - k, rotatedArray, 0, k);
        }
        
        return rotatedArray;
    }
}
