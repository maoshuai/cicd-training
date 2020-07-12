package code.smell.magic_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BarTest {

    @Test
    public void should_be_able_to_do_something() {
        Bar bar = new Bar();

        assertTrue(bar.doSomething(22, 1));
        assertFalse(bar.doSomething(16, 1));
    }
}