package com.codility.lesson3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

    @Test
    void testSolution() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        
        assertEquals(2, tapeEquilibrium.solution(new int[] {3, 5}));
        assertEquals(1, tapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}));
        assertEquals(0, tapeEquilibrium.solution(new int[] {1, -1, -1, 1, 1, -1}));
        
        int[] array = new int[100000];
        Arrays.fill(array, 0, 100000, 1000);
        assertEquals(0, tapeEquilibrium.solution(array));
    }

}
