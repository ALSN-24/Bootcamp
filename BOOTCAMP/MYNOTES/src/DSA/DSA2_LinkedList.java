package DSA;

/*
    LinkedList
    Insert 70, 60, 40, 30
    Reverse and display
    delete at begin 2 times
    insertatbegin 24, 16, 8
    insertatend 46, 75
    deletePosition [4]
 */

import java.util.Collections;
import java.util.LinkedList;


public class DSA2_LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> llNew = new LinkedList<>();

//      Insert 70, 60, 40, 30
        ll.add(70);
        ll.add(60);
        ll.add(40);
        ll.add(30);

        System.out.print("Is it inserted? ");
        System.out.print(ll.equals(ll)) ;
        System.out.println(" " + ll);




//      Reverse and display
        for (int i : ll) {
            llNew.addFirst(i);
        }
        System.out.println("\nReversed = " + llNew);

//        Collections.reverse(ll);
//        System.out.println("Reversed = " + ll);

//      delete at begin 2 times
        llNew.remove();
        llNew.remove();
        System.out.println("\nDelete at begin 2 times = " + llNew);

//      insertatbegin 24, 16, 8
        llNew.addFirst(24);
        llNew.addFirst(16);
        llNew.addFirst(8);

        System.out.println("\nInsert at begin 24, 16, 8 = " + llNew);

//      insertatend 46, 75
        llNew.addLast(46);
        llNew.addLast(75);

        System.out.println("\nInsert at end 46, 75 = " + llNew);

//      deletePosition [4]
        llNew.remove(4);

        System.out.println("\nDelete Position [4] = " + llNew);

    }
}
