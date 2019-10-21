package lesson4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogRiverOneTest {

    @Test
    void testSolution() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        
        assertEquals(0, frogRiverOne.solution(1, new int[] {1}));
        assertEquals(0, frogRiverOne.solution(1, new int[] {1, 1, 1}));
        assertEquals(-1, frogRiverOne.solution(2, new int[] {1, 1, 1, 1}));
        assertEquals(-1, frogRiverOne.solution(3, new int[] {2, 3, 3}));
        assertEquals(-1, frogRiverOne.solution(4, new int[] {1, 2, 4}));
        assertEquals(6, frogRiverOne.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
        assertEquals(3, frogRiverOne.solution(4, new int[] {1, 4, 2, 3, 1, 3, 2}));
    }

}
