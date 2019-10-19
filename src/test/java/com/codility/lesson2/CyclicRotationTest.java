package com.codility.lesson2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CyclicRotationTest {

    @Test
    void test() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(new int[] {9, 7, 6, 3, 8}, cyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[] {0, 0, 0}, cyclicRotation.solution(new int[] {0, 0, 0}, 3));
        assertArrayEquals(new int[] {1, 2, 3, 4}, cyclicRotation.solution(new int[] {1, 2, 3, 4}, 4));
        assertArrayEquals(new int[] {1, 2, 3, 4}, cyclicRotation.solution(new int[] {3, 4, 1, 2}, 6));
        assertArrayEquals(new int[] {1, 2, 3, 4}, cyclicRotation.solution(new int[] {1, 2, 3, 4}, 0));
        assertArrayEquals(new int[0], cyclicRotation.solution(new int[] {}, 3));
    }

}
