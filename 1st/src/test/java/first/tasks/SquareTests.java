package first.tasks;

import org.testng.annotations.Test;
import org.testng.Assert;
//import org.slf4j.impl.StaticLoggerBinder;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
