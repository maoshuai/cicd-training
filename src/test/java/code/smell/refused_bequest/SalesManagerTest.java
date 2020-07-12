package code.smell.refused_bequest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SalesManagerTest {
    @Test
    public void should_have_quota_less_than_5000() {
        SalesManager manager = new SalesManager();

        assertTrue(manager.hasSalesQuota(2000));
        assertFalse(manager.hasSalesQuota(5000));
        assertFalse(manager.hasSalesQuota(5001));
    }

}