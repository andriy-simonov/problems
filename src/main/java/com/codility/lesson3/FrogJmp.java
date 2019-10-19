package com.codility.lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        if (Y - X == 0) {
            return 0;
        }

        int i = 1;
        int distanceJumpedOnPrecedingStep = 0;
        int distanceJumped = D;
        while (distanceJumped < Y - X) {
            i *= 2;
            distanceJumpedOnPrecedingStep = distanceJumped;
            distanceJumped = D * i;
        }
        
        if (Y - X - distanceJumpedOnPrecedingStep > D) {
            i = i / 2 + solution(X + distanceJumpedOnPrecedingStep, Y, D);
        }
        else if(Y - X - distanceJumpedOnPrecedingStep <= D) {
            i = i / 2 + 1;
        }
        
        return i;
    }
}
