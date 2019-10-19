package com.codility.lesson3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermMissingElemTest {

    @Test
    void test() {
        PermMissingElem permMissingElem = new PermMissingElem();
        
        assertEquals(1, permMissingElem.solution(new int[] {2}));
        assertEquals(2, permMissingElem.solution(new int[] {1, 3}));
        assertEquals(1, permMissingElem.solution(new int[] {2, 3, 4, 5}));
        assertEquals(4, permMissingElem.solution(new int[] {2, 3, 1, 5}));
        assertEquals(3, permMissingElem.solution(new int[] {2, 4, 1, 5}));
        assertEquals(5, permMissingElem.solution(new int[] {2, 4, 1, 3}));
    }

}
