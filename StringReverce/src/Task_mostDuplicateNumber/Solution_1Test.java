package Task_mostDuplicateNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_1Test {

    /**
     * Есть массив int[]. Вывести число, которое встречается чаще всех
     * {1,2,3,4,5,3,5} -> 3 (если несколько - то первое из них)
     */

    Solution_1 solution1 = new Solution_1();

    @Test
    public void testSolution_1() {
        int[] numArray = {1, 2, 3, 4, 5, 3};
        int exp = 3;
        int akt = solution1.mostDuplicateNumber(numArray);
        assertEquals(exp, akt);
    }

    @Test
    public void testSolution_2() {
        int[] numArray = {1, 2, 3, 4, 5, 3, 4, 2, 4};
        int exp = 4;
        int akt = solution1.mostDuplicateNumber(numArray);
        assertEquals(exp, akt);
    }

    @Test
    public void testSolution_3() {
        int[] numArray = {1};
        int exp = 1;
        int akt = solution1.mostDuplicateNumber(numArray);
        assertEquals(exp, akt);
    }

    @Test
    public void testSolution_4() {
        int[] numArray = {2, 2, 1, 1};
        int exp = 2;
        int akt = solution1.mostDuplicateNumber(numArray);
        assertEquals(exp, akt);
    }

}
