package Task_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /**
     * Будем называть последовательность чисел "переключающий" если все элементы на четных местах равны между собой,
     * а также и на нечетных. Любая длина
     * {5,-3,5,-3,5} -> true
     */


    Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] array = {5, -3, 5, -3, 5};
        boolean akt = solution.isSwitch(array);

        assertTrue(akt);
    }

    @Test
    public void test_2() {
        int[] array = {5, -4, 5, -3, 5};
        boolean akt = solution.isSwitch(array);

        assertFalse(akt);
    }

    @Test
    public void test_3() {
        int[] array = {5, -4, 5, -3, 5, -3, -3, 5, 5};
        boolean akt = solution.isSwitch(array);

        assertFalse(akt);
    }

}
