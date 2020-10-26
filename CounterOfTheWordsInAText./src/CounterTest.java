import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CounterTest {


    @Test
    public void testCounter_1() {
        String s1 = "Раз- раз два; два три три: три три..";
        Map<String,Integer> exp = new HashMap<>();
        exp.put("Раз",1);
        exp.put("раз",1);
        exp.put("два",2);
        exp.put("три",4);


        Map<String,Integer> akt = Counter.counter(s1);

        Assert.assertEquals(exp,akt);
    }

    @Test
    public void testCounter_2() {
        String s2 = "Раз, раз-раз два, два три три три три..";
        Map<String,Integer> exp = new HashMap<>();
        exp.put("Раз",1);
        exp.put("раз",2);
        exp.put("два",2);
        exp.put("три",4);


        Map<String,Integer> akt = Counter.counter(s2);

        Assert.assertEquals(exp,akt);
    }

    @Test
    public void testCounter_3(){
        String s3 = "Раз, раз  два два три , три три три..";
        Map<String,Integer> exp = new HashMap<>();
        exp.put("Раз",1);
        exp.put("раз",1);
        exp.put("два",2);
        exp.put("три",3);
        exp.put("три..",1);

        Map<String,Integer> akt = Counter.counter(s3);

        Assert.assertNotEquals(exp,akt);
    }

}
