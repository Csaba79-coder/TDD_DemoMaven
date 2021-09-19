package module;

import org.junit.Assert;
import org.junit.Test;


public class CheckingNumberTest {

    @Test
    public void isPositiveNumTest() {
        int pos = 1;
        int neg = -1;
        int zero = 0;

        // this one needs to refactor, see bellow!
        Assert.assertTrue(CheckingNumber.isPositiveNum(pos) == 3);
        Assert.assertTrue(CheckingNumber.isPositiveNum(zero) == 2);
        Assert.assertTrue(CheckingNumber.isPositiveNum(neg) == 1);
    }

    // this is the refactor the above mention code
    @Test
    public void isPositiveNumTestRefactor() {
        int pos = 1;
        int neg = -1;
        int zero = 0;

        Assert.assertEquals(3, CheckingNumber.isPositiveNum(pos));
        Assert.assertEquals(1, CheckingNumber.isPositiveNum(neg));
        Assert.assertEquals(2, CheckingNumber.isPositiveNum(zero));
    }

    @Test
    public void isPositiveBooleanTest() {
        int pos = 1;
        int neg = -1;
        int zero = 0;

        Assert.assertTrue(CheckingNumber.isPositiveBoolean(pos));
        Assert.assertFalse(CheckingNumber.isPositiveBoolean(neg));
        Assert.assertFalse(CheckingNumber.isPositiveBoolean(zero));
    }
}