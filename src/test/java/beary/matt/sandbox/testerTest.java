package beary.matt.sandbox;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class testerTest {
    @Test
    public void shouldSucceed() {
        Assertions.assertEquals("hello", tester.hi());
    }
    @Test
    public void shouldFail() {
        Assertions.assertEquals("world", tester.hi());
    }
}
