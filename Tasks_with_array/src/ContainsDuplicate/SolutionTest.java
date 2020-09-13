package ContainsDuplicate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SolutionTest {


    @Test
    public void testContainsDuplicate_true() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(Solution.findTheDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate_true_1() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(Solution.findTheDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate_true_3() {
        int[] nums = new int[]{2, 14, 18, 22, 22};
        Assertions.assertTrue(Solution.findTheDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate_false() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(Solution.findTheDuplicate(nums));
    }


}