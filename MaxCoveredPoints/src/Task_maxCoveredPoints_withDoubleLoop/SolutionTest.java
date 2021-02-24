package Task_maxCoveredPoints_withDoubleLoop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
    Solution solution = new Solution();
    int cut = 9;


    @Test
    public void testMaxCoveredPoints_1() {
        List<Integer> numbers = Collections.emptyList();

        int exp = 0;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }

    @Test
    public void testMaxCoveredPoints_2() {
        List<Integer> numbers = Collections.singletonList(2);

        int exp = 1;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }

    @Test
    public void testMaxCoveredPoints_3() {
        List<Integer> numbers = Arrays.asList(1, 5);

        int exp = 2;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }

    @Test
    public void testMaxCoveredPoints_4() {
        List<Integer> numbers = Arrays.asList(1, 11);

        int exp = 1;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }


    @Test
    public void testMaxCoveredPoints_5() {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 31, 40, 55, 58, 64);

        int exp = 3;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }


    @Test
    public void testMaxCoveredPoints_6() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 13, 14, 18, 19);

        int exp = 5;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }

    @Test
    public void testMaxCoveredPoints_7() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 11, 12, 13, 14, 15, 22, 23);

        int exp = 6;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }

    @Test
    public void testMaxCoveredPoints_9() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 11, 12, 18, 19, 20);

        int exp = 5;
        int akt = solution.maxCoveredPoints(numbers, cut);

        assertEquals(exp, akt);
    }
}
