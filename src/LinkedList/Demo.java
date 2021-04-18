package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("kano");
        linkedList.add("jos");
        linkedList.add("sokoto");
        linkedList.add("lagos");
        linkedList.add("abuja");
        linkedList.add("ogun");

        System.out.println("the places i visited are : " + linkedList);
        linkedList.add(2, "kaduna");

        System.out.println("the places i visited are : " + linkedList);

        printList(linkedList);
        linkedList.add(1, "yobe");
        printList(linkedList);
        linkedList.remove("yobe");
        printList(linkedList);
        linkedList.clone();
        printList(linkedList);


    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("*****************************************");
    }


}