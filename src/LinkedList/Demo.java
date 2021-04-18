package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        addInOrder(linkedList,"lagos");
        addInOrder(linkedList,"kano");
        addInOrder(linkedList,"abuja");
        addInOrder(linkedList,"maiduguri");
        addInOrder(linkedList,"patami");
        addInOrder(linkedList,"yola");

        printList(linkedList);

    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("*****************************************");
    }

    public static boolean addInOrder (LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + "is already on the list");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }


}