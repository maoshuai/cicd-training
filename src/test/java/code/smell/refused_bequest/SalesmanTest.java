package code.smell.refused_bequest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SalesmanTest {

    @Test
    public void should_have_quota_less_than_1000() {
        Salesman salesman = new Salesman();

        assertTrue(salesman.hasSalesQuota(100));
        assertFalse(salesman.hasSalesQuota(1000));
        assertFalse(salesman.hasSalesQuota(1001));
    }
}