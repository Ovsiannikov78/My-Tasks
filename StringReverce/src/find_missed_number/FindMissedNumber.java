package find_missed_number;

import java.util.Arrays;

public class FindMissedNumber {

    /**
     * Есть массив из неповторяющихся чисел от 1 до 100 (всего 99 чисел вразброс).
     * В массиве присутствуют все числа, кроме одного.
     * Найти оное (это число).
     */


    public int findMissedNumber(int[] numbers) {

        int[] sortedArray = Arrays.stream(numbers).sorted().toArray();

        for (int i = 0; i < sortedArray.length - 1; i++) {

            if (sortedArray[i] != i + 1) {
                return sortedArray[i] - 1;
            }
            if (sortedArray[sortedArray.length - 1] != sortedArray.length + 1) {
                return sortedArray.length + 1;
            }
            if (sortedArray[i + 1] - sortedArray[i] != 1) {
                return sortedArray[i] + 1;
            }
        }
        return 0;
    }
}