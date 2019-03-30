import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void operation() {
        Division division = new Division();
        Assert.assertTrue(10 == division.operation(30, 3));
    }
}