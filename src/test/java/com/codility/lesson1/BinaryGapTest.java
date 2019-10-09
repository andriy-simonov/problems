package com.codility.lesson1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    void testSolution() {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(0, binaryGap.solution(1));
        assertEquals(0, binaryGap.solution(2));
        assertEquals(2, binaryGap.solution(147));
        assertEquals(3, binaryGap.solution(483));
        assertEquals(4, binaryGap.solution(647));
    }

}
