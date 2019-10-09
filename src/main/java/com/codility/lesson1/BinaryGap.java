package com.codility.lesson1;

public class BinaryGap {
    public int solution(int n) {
        
        boolean cameAcrossOne = false;
        
        int gapLength = 0;
        int currentGapLength = 0;
        
        for (int i = 0; i < Integer.SIZE; ++ i) {
            if (cameAcrossOne) {
                if ((n >> i & 1) == 0) {
                    currentGapLength += 1;
                }
                else {
                    gapLength = currentGapLength > gapLength ? currentGapLength : gapLength;
                    currentGapLength = 0;
                }
            }
            else {
                cameAcrossOne = (n >> i & 1) == 1;
            }
        }
        
        return gapLength;
    }
}
