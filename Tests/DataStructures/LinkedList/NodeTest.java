package DataStructures.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node<Integer> node;

    @BeforeEach
    void setUp() {
        node = new Node<>(10);
    }

    @Test
    void hasData(){
      int data = node.getData();
      assertEquals(10,data);
    }

    @Test
    void canPointToNextNode(){
        Node<Integer> nextNode = node.getNext();
        assertNull(nextNode);

        node.setNext(new Node<>(15));
        assertNotNull(node.getNext());
        assertEquals(15,node.getNext().getData());
    }


}