package Task_2;

import java.util.*;

/**
 * Есть ряд (List) положительных int чисел, расположенных по возрастанию.
 * Есть число N. Определить, можно ли N разложить на произведение двух различных элементов из ряда-листа.
 * {1, 5, 8, 20} & 15 -> false;
 * {1, 5, 8, 20} & 40 -> true;
 * {1, 5, 5, 8, 20} & 25 -> true;
 * {1, 5, 8, 20} & 25 -> false;
 */

public class Solution2 {

    public static void main(String[] args) {

    }

    public Boolean findFactorsForNumberN(List<Integer> numbers, Integer n) {
        Deque<Integer> deque = new ArrayDeque();
        boolean res = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (!deque.isEmpty() && numbers.get(i) * deque.getLast() == n) {
                res = true;
            } else {
                deque.add(numbers.get(i));
            }
        }
        return res;
    }
}
