package ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(findTheDuplicate(nums));

    }

    public static boolean findTheDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            if (!hashSet.add(i))
                return true;
        }
        return false;
    }
}