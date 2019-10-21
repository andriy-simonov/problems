package lesson4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxCountersTest {

    @Test
    void testSolution() {
        MaxCounters maxCounters = new MaxCounters();
        
        assertArrayEquals(new int[] {2}, maxCounters.solution(1, new int[] {1, 1}));
        assertArrayEquals(new int[] {1}, maxCounters.solution(1, new int[] {2, 1, 3}));
        assertArrayEquals(new int[] {0, 0, 1}, maxCounters.solution(3, new int[] {4, 5, 3}));
        assertArrayEquals(new int[] {3, 2, 2, 4, 2}, maxCounters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
    }

}
