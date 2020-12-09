package Task_3;

import java.util.*;

public class Solution_1 {

    /**
     * Есть массив int[]. Вывести число, которое встречается чаще всех
     * {1,2,3,4,5,3,5} -> 3 (если несколько - то первое из них)
     */

    public int mostDuplicateNumber(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.computeIfPresent(num, (k, v) -> v + 1);
            map.putIfAbsent(num, 1);
        }
        return map.entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get().getKey();
    }
}