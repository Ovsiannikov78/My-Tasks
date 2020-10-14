import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SolutionTest {
    public static List<String> words = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "anan", "navi");

    Solution solution = new Solution(words);

    @Test
    public void testGetAnagramms_anna() {
        List<String> exp = Arrays.asList("anna", "naan", "nana", "anan");
        List<String> akt = solution.getAnagramms("anna");

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testGetAnagramms_ivan() {
        List<String> exp = Arrays.asList("ivan", "vani", "navi");
        List<String> akt = solution.getAnagramms("ivan");

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testGetAnagramms_piotr() {
        List<String> exp = Collections.singletonList("piotr");
        List<String> akt = solution.getAnagramms("piotr");

        Assert.assertEquals(exp, akt);
    }
}