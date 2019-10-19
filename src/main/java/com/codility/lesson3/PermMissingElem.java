package com.codility.lesson3;

public class PermMissingElem {
    public int solution(int[] A) {
        int[] valueMatchingIndexArray = new int[A.length + 1];
        for (int i = 0; i < A.length; ++ i) {
            valueMatchingIndexArray[A[i] - 1] = A[i];
        }
        
        int missingElement = 0;
        for (int i = 0; i < valueMatchingIndexArray.length; ++ i) {
            if (valueMatchingIndexArray[i] == 0) {
                missingElement = i + 1;
            }
        }
        
        return missingElement;
    }
}
