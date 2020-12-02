package Task_1;

import java.util.*;

/**
 * Есть лист целых ( Integer) чисел.
 * Известно что каждое число, кроме одного, имеет пару.
 * Найти число без пары. {3, 5, 3} -> 5; {3,5,3,3,3} -> 5; {3,5,3,5,3} -> 3
 */

public class Solution {

    public Integer findNumberWithoutPair(List<Integer> list) {
        Integer res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer el : list) {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                res = entry.getKey();
            }
        }
        return res;
    }
}