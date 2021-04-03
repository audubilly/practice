package SampleBank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("joseph",200.00);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCustomerCanCreatedInBank(){
        customer.setName("joseph");
//        customer.getName();
        assertEquals("joseph", customer.getName());
    }

    @Test
    void testThatCustomerCanRunATransaction(){
        customer.addTransactions(200.0);
        customer.addTransactions(300.0);
//        customer.getTransactions();
        assertEquals(3,customer.getTransactions().size());

    }
}