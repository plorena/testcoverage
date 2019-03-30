import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubstractionTest {

    @Test
    public void operation() {
        Substraction substraction = new Substraction();
        Assert.assertTrue(4 == substraction.operation(7, 3));
    }
}