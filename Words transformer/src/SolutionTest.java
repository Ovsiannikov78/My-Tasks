import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase


    @Test
    public void testTransformer_1() {
        String str = "abc defG ikl";
        String exp = "ABC defG IKL";
        String akt = Solution.transformer(str);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testTransformer_2() {
        String str = "ab defG Adt";
        String exp = "ab defG ADT";
        String akt = Solution.transformer(str);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testTransformer_4() {
        String str = "ABC dCb Adt aaB agt";
        String exp = "ABC DCB ADT AAB AGT";
        String akt = Solution.transformer(str);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testTransformer_3() {
        String str = "ab d Adt";
        String exp = "AB d ADT";
        String akt = Solution.transformer(str);

        Assert.assertNotEquals(exp, akt);
    }


}
