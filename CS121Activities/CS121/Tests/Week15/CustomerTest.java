package Week15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customers = new Customer("Julius", "Lillard", "555-6698","Julius@gmail.com", "123ABC", 19);

    @Test
    void getCustomerInfo() {
        assertEquals("Name: Julius", customers.getCustomerInfo());
    }
    @Test
    void getName() {
        assertEquals("Julius", customers.getFirstName());
    }
}