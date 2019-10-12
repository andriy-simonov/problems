package com.codility.lesson2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

    @Test
    void testSolution() {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        assertEquals(1, oddOccurrencesInArray.solution(new int[] {1, 2, 2}));
        assertEquals(1, oddOccurrencesInArray.solution(new int[] {2, 2, 1}));
        assertEquals(1, oddOccurrencesInArray.solution(new int[] {1, 1, 1, 1, 1}));
        assertEquals(1, oddOccurrencesInArray.solution(new int[] {9, 3, 9, 3, 9, 1, 9}));
        assertEquals(1, oddOccurrencesInArray.solution(new int[] {2, 3, 4, 5, 6,
                7, 8, 9, 10, 11,
                2, 3, 4, 5, 6,
                1, 12, 13, 14, 15,
                16, 7, 8, 9, 10,
                11, 12, 13, 14, 15,
                16
        }));
    }

}
