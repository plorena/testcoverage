import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void operation() {
        Addition addition = new Addition();
        Assert.assertTrue(10 == addition.operation(7, 3));
    }
}