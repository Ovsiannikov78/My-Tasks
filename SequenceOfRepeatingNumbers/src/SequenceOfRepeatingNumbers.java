



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequenceOfRepeatingNumbers {
    /* Условие;
       Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
       Пример для списка ; ArrayList (2, 4, 4, 4, 8, 8, 4, 4, 7, 8) -> 3;
                           ArrayList (2, 2, 2, 4, 4, 4, 4, 4, 4, 4) -> 7;
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 4, 4, 4, 8, 8, 4, 4, 7, 8);
        System.out.println(longestSequenceOfRepeatingNumbers(list)); 



    }
    public static int longestSequenceOfRepeatingNumbers(List<Integer> list) {
        int count = 1;
        int count1 = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                count++;
            } else {
                count = 1;
            }
            if (count > count1) {
                count1 = count;
            }
        }
        return count1;
    }
}