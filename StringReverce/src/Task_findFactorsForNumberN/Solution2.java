package Task_findFactorsForNumberN;

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
    private static List<Integer> numbers = Arrays.asList(1, 5, 8, 20);


    // O(n)

    public static Boolean findFactorsForNumberN(List<Integer> numbers, Integer n) {
        Deque<Integer> deque = new ArrayDeque<>(numbers);
        while (deque.size() >= 2) {
            int multiplication = deque.getFirst() * deque.getLast();
            if (multiplication > n) {
                deque.removeLast();
            } else if (multiplication < n) {
                deque.removeFirst();
            } else {
                return true;
            }
        }
        return false;
    }

    // O(n*n) - n is equal to size
    /*public boolean findFactorsForNumberN(List<Integer> numbers, int n) {
        ArrayList<Integer> list = new ArrayList<>(numbers);//O(n)
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int a = list.get(i);
            for (int j = i + 1; j < size; j++) {
                int b = list.get(j);
                if (a * b == n)
                    return true;
            }
        }
        return false;
    }*/
}
