package lesson4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingIntegerTest {

    @Test
    void testSolution() {
        MissingInteger missingInteger = new MissingInteger();
        
        assertEquals(5, missingInteger.solution(new int[] {1, 3, 6, 4, 1, 2}));
        assertEquals(2, missingInteger.solution(new int[] {1}));
        assertEquals(1, missingInteger.solution(new int[] {2}));
        assertEquals(1, missingInteger.solution(new int[] {-3, -5}));
        assertEquals(4, missingInteger.solution(new int[] {1, 3, 2}));
        assertEquals(1, missingInteger.solution(new int[] {-1000000, 1000000}));
    }

}
