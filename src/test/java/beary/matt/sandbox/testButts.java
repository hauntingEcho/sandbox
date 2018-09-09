package beary.matt.sandbox;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class testButts {
    @Test
    public void shouldSucceed() {
        Assertions.assertEquals("butts", butts.getButts());
    }
    @Test
    public void shouldFail() {
        Assertions.assertEquals("not butts", butts.getButts());
    }
}
