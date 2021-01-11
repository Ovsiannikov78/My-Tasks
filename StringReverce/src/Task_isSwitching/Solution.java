package Task_isSwitching;

import java.util.List;

public class Solution {

    /**
     * Будем называть последовательность чисел "переключающий" если все элементы на четных местах равны между собой,
     * а также и на нечетных. Любая длина
     * {5,-3,5,-3,5} -> true
     */

    public boolean isSwitching(int[] array) {
        if (array.length < 3)
            return true;

        for (int i = 2; i < array.length; i++) {
            if (array[i] != array[i - 2])
                return false;
        }

        return true;
    }

    public boolean isSwitching(List<Integer> list) {
        int[] array = list.stream()
                .mapToInt(value -> value)
                .toArray();

        return isSwitching(array);
    }
}
