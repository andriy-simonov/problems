package com.codility.lesson3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogJmpTest {

    @Test
    void test() {
        FrogJmp frogJmp = new FrogJmp();
        assertEquals(0, frogJmp.solution(27, 27, 10));
        assertEquals(1, frogJmp.solution(10, 20, 10));
        assertEquals(2, frogJmp.solution(10, 30, 10));
        assertEquals(3, frogJmp.solution(10, 40, 10));
        assertEquals(4, frogJmp.solution(10, 50, 10));
        assertEquals(149, frogJmp.solution(10, 1500, 10));
        assertEquals(148, frogJmp.solution(23, 1500, 10));
        assertEquals(148, frogJmp.solution(27, 1500, 10));
    }

}
