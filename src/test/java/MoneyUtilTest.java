import org.example.MoneyUtil;
import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void testDinero(){
        String dinero = MoneyUtil.formatear(1000.0,"€");
        Assert.assertEquals("€1000.00",dinero);
    }

    @Test
    public void testDineroNegativo(){
        String dinero = MoneyUtil.formatear(-1000.0,"£");
        Assert.assertEquals("-£1000.00",dinero);
    }

}
