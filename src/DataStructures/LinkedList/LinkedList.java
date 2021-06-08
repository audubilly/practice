package DataStructures.LinkedList;

public class LinkedList {

    private Node<Integer> head;
    private Node<Integer> tail;
    private int size;

    public LinkedList(Node<Integer> node){
        head = node;
        size ++;
        tail = node;
    }

    public Node<Integer> getHead(){
        return head;
    }

    public int getSize() {
        return size;
    }

    public void add(Node<Integer> node) {
//        Node <Integer> currentNode = head;
//        while(currentNode != null){
//            currentNode = currentNode.getNext();
//        }
//            currentNode = node;
//            tail = currentNode;
//            size ++;
        tail.setNext(node);
        tail = node;
        size++;
   }

    public Node<Integer> getTail() {
        return tail;
    }
}
