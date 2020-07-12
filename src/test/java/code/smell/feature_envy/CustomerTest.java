package code.smell.feature_envy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void should_get_customer_name_and_address() {
        Phone phone = new Phone("01055588888");
        Customer customer = new Customer("Li", phone);

        assertEquals("Li(010)555-8888", customer.getNameAndPhone());
    }
}