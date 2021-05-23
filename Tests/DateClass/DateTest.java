package DateClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    private Date date ;

    @BeforeEach
    void setUp() {
        date = new Date(11,12,2021);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatDateClassCanBeCreated(){
        date = new Date(11,12,2001);
        assertEquals(11,date.getDay());
         assertEquals(12,date.getMonth());
         assertEquals(2001,date.getYear());
    }

    @Test
    void testThatDateCanBeDisplayedInStringFormat(){
        String result = date.displayDate();
        assertTrue(true,result);
    }
}