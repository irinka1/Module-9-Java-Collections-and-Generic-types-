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
        myList.print();
        System.out.println();

        System.out.println("Следующее задание MyLinkedList:");
        MyLinkedList myLinkedList = new MyLinkedList(){};
        myLinkedList.add(5);
        myLinkedList.add(1);
        myLinkedList.add(65);
        myLinkedList.add(51);
        myLinkedList.size();
        myLinkedList.show();
        System.out.println();
       // myLinkedList.remove(2);
        myLinkedList.show();
        System.out.println();
        //myLinkedList.clear();
        myLinkedList.show();
        myLinkedList.get(1);

        System.out.println("Следующее задание MyQueue:");
        MyQueue myQueue = new MyQueue(6, new Object[]{5,8,1,3,9});
        myQueue.print();
        System.out.println();
        myQueue.add(55);
        myQueue.print();
        System.out.println();
        myQueue.remove(4);
        myQueue.print();
        System.out.println();
        myQueue.print();
        System.out.println();
        myQueue.peek();
        myQueue.print();
        System.out.println();
        myQueue.poll();
        myQueue.print();
        System.out.println();


        System.out.println("Следующее задание MyStack:");
        MyStack myStack = new MyStack(5,new Object[]{14,15,49,12});
        myStack.push(457);
        myStack.print();
        System.out.println();
        myStack.remove(1);
        myStack.print();
        System.out.println();





    }

}
