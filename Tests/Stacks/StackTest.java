package Stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack [] arr;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testThatAnewStackCanBeInitialized(int size){
         arr = new Stack[size];
        assertEquals(-1, arr.length);
    }
}