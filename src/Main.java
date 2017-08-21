import java.util.ArrayList;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {


       MyArrayList<Integer> myList = new MyArrayList<Integer>(5,new Object[]{1,8,8,9});


        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.remove(1);
        myList.clear();
        myList.size();
        myList.get(2);     //get(int index) возвращает элемент под индексом


        System.out.println("Numbers = " + myList);
    }

}
