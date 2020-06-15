package unit.test.challenge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    @Test
    void junit_assertion_should_work() {
        assertEquals(1, 1);
    }

    @Test
    void assert_j_assertion_should_work() {
        assertThat(1).isEqualTo(1);
    }
}
