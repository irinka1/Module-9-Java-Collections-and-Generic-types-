import java.util.ArrayList;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {


       MyArrayList myList = new MyArrayList<>();


        myList.add(25);
        myList.add(15);
        myList.add(14);
        myList.add(8);
        myList.remove(1);
        //myList.clear();
        myList.size();
        myList.get(2);     //get(int index) возвращает элемент под индексом


        System.out.println("Numbers = " + myList);
    }

}
