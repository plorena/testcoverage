import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void operation() {
        Multiplication multiplication = new Multiplication();
        Assert.assertTrue(21 == multiplication.operation(7, 3));
    }
}