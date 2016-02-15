package Module5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test(timeout = 200)
    public void testMaxValue() throws Exception {

        int[] a  = {41,45,536,345,123,7};

        Max max = new Max();
        int result = Max.maxValue(a);

        Assert.assertEquals(536, result);

    }
}