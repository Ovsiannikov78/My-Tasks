import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequenceOfRepeatingNumbersTest {

    /* Условие;
       Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
       Пример для списка ; ArrayList (2, 4, 4, 4, 8, 8, 4, 4, 7, 8) -> 3;
                           ArrayList (2, 2, 2, 4, 4, 4, 4, 4, 4, 4) -> 7;
    */

    @Test
    public void testSequenceOfRepeatingNumbers(){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 4, 4, 4, 8, 8, 4, 4, 7, 8);

        int exp = 3;
        int akt = SequenceOfRepeatingNumbers.longestSequenceOfRepeatingNumbers(list);

        Assert.assertEquals(exp,akt);
    }

    @Test
    public void testSequenceOfRepeatingNumbers1(){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 2, 2, 4, 4, 4, 4, 4, 4, 4);

        int exp = 7;
        int akt = SequenceOfRepeatingNumbers.longestSequenceOfRepeatingNumbers(list);

        Assert.assertEquals(exp,akt);
    }
}
