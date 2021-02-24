package Task_4;

import java.util.HashMap;
import java.util.Map;


public class Solution {

    /**
     * Будем называть последовательность чисел "переключающий" если все элементы на четных местах равны между собой,
     * а также и на нечетных. Любая длина
     * {5,-3,5,-3,5} -> true
     */

    public boolean isSwitch(int[] num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : num) {
            map.putIfAbsent(n, n);
        }
        return map.size() == 2;
    }
}
