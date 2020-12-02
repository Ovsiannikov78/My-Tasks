package Task_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Есть лист целых ( Integer) чисел.
 * Известно что каждое число, кроме одного, имеет пару.
 * Найти число без пары. {3, 5, 3} -> 5; {3,5,3,3,3} -> 5; {3,5,3,5,3} -> 3
 */


class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testNumberWithoutPair_1() {
        List<Integer> integers = Arrays.asList(3, 5, 3);

        Integer exp = 5;
        Integer act = solution.findNumberWithoutPair(integers);

        assertEquals(exp, act);
    }

    @Test
    public void testNumberWithoutPair_2() {
        List<Integer> integers = Arrays.asList(3, 5, 3, 3, 3);

        Integer exp = 5;
        Integer act = solution.findNumberWithoutPair(integers);

        assertEquals(exp, act);
    }

    @Test
    public void testNumberWithoutPair_3() {
        List<Integer> integers = Arrays.asList(3, 5, 3, 5, 3);

        Integer exp = 3;
        Integer act = solution.findNumberWithoutPair(integers);

        assertEquals(exp, act);
    }

    @Test
    public void testNumberWithoutPair_4() {
        List<Integer> integers = Collections.emptyList();

        Integer exp = 0;
        Integer act = solution.findNumberWithoutPair(integers);

        assertEquals(exp, act);
    }

    @Test
    public void testNumberWithoutPair_5() {
        List<Integer> integers = Arrays.asList(3, 3, 5, 3, 5, 3);

        Integer exp = 0;
        Integer act = solution.findNumberWithoutPair(integers);

        assertEquals(exp, act);
    }
}
