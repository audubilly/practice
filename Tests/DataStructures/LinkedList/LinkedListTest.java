//package DataStructures.LinkedList;
//
//import DataStructures.LinkedList.Node;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class LinkedListTest {
//    LinkedList linkedList;
//    Node<Integer> node;
//
//    @BeforeEach
//    void setUp() {
//        linkedList = new LinkedList(node);
//        node = new Node<>(5);
//    }
//
//    @Test
//    void hasAHead(){
//        Node<Integer> head = linkedList.getHead();
//        assertNotNull((head);
//        assertEquals(node,head);
//    }
//    @Test
//    void hasATail() {
//        Node<Integer> tail = linkedList.getTail();
//        assertNotNull(tail);
//        assertEquals(node, tail);
//    }
//
//    @Test
//    void hasSize(){
//        assertEquals(1,linkedList.getSize());
//
//    }
//    @Test
//    void add(){
//        Node<Integer> newNode = new Node<>(20);
//        //when
//        linkedList.add(newNode);
//        assertEquals(2,linkedList.getSize());
//        assertEquals(newNode,linkedList.getTail());
//
//    }
//}