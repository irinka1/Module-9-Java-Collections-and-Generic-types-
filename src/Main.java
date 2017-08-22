import java.util.ArrayList;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {


       MyArrayList<Integer> myList = new MyArrayList<Integer>(5,new Object[]{1,8,8,9});


        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.print();
        System.out.println();
        myList.remove(1);
        myList.print();
        System.out.println();
        myList.clear();
        myList.size();
        myList.get(2);
        myList.print();
        System.out.println();

        MyLinkedList myLinkedList = new MyLinkedList(){};
        myLinkedList.add(5);
        myLinkedList.add(1);
        myLinkedList.add(65);
        myLinkedList.add(51);
           myLinkedList.show();
        System.out.println();
        myLinkedList.remove(5);
           myLinkedList.show();
        System.out.println();
        myLinkedList.clear();
          myLinkedList.show();



    }

}
