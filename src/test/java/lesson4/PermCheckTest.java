package lesson4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermCheckTest {

    @Test
    void testSolution() {
        PermCheck permCheck = new PermCheck();
        
        assertEquals(1, permCheck.solution(new int[] { 1 }));
        assertEquals(0, permCheck.solution(new int[] { 2 }));
        assertEquals(0, permCheck.solution(new int[] { 4, 1, 2 }));
        assertEquals(0, permCheck.solution(new int[] { 1, 5, 2, 3 }));
        
        assertEquals(1, permCheck.solution(new int[] { 1, 4, 2, 3 }));
        assertEquals(0, permCheck.solution(new int[] { 1, 3, 2, 3 }));
        assertEquals(0, permCheck.solution(new int[] { 1, 4, 2, 4 }));
        assertEquals(0, permCheck.solution(new int[] { 2, 4, 5, 3 }));
    }

}
