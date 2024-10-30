import org.junit.Assert;
import org.junit.Test;

public class newTest {

    @Test
    public void simpleTests() {
        Assert.assertTrue(true);
    }

    @Test
    public void simpleTests1() {
        Assert.assertTrue(true);
    }

    @Test
    public void simpleTests2() {
        Assert.assertTrue(true);
    }

    @Test
    public void addTwoNumbers(){
        int expected = 2+5;
        int actual = 7;
        Assert.assertEquals(expected, actual);

    }


}