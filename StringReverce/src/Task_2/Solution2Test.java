package Task_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Есть ряд (List) положительных int чисел, расположенных по возрастанию.
 * Есть число N. Определить, можно ли N разложить на произведение двух различных элементов из ряда-листа.
 * {1, 5, 8, 20} & 15 -> false;
 * {1, 5, 8, 20} & 40 -> true;
 * {1, 5, 5, 8, 20} & 25 -> true;
 * {1, 5, 8, 20} & 25 -> false;
 */


class Solution2Test {

    Solution2 solution2 = new Solution2();

    @Test
    public void testSolution2_1() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 20);

        boolean act = solution2.findFactorsForNumberN(numbers, 15);

        assertFalse(act);
    }

    @Test
    public void testSolution2_2() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 20);

        boolean act = solution2.findFactorsForNumberN(numbers, 40);

        assertTrue(act);
    }

    @Test
    public void testSolution2_3() {
        List<Integer> numbers = Arrays.asList(1, 5, 5, 8, 20);

        boolean act = solution2.findFactorsForNumberN(numbers, 25);

        assertTrue(act);
    }

    @Test
    public void testSolution2_4() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 20);

        boolean act = solution2.findFactorsForNumberN(numbers, 5);

        assertTrue(act);
    }

    @Test
    public void testSolution2_5() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 20);

        boolean act = solution2.findFactorsForNumberN(numbers, 25);

        assertFalse(act);
    }
}
