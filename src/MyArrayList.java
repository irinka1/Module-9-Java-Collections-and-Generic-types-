import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {   //далее вместо Т будет подставляться класс

    public Object [] array;
    public ArrayList[] array1;
    int index;

    public void add(T value ){

        Object[] arrayBigger = new Object[array.length + 1];
        System.arraycopy(array, 0, arrayBigger, 0, array.length);
        int t = arrayBigger.length-1;
        arrayBigger [t] = value;
        array = arrayBigger;
    }



    //remove(int index) удаляет элемент под индексом
    public void remove(int index){

       // Iterator<MyArrayList> it = array1.iterator();
        for (int i = 0; i < array.length; i++) {
            array[index] = null;

        }
    }

    //clear() очищает коллекцию
    public void clear(){
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    //size() возвращает размер коллекции
    int total=0;
    public int size(){
        for (int i = 0; i < array.length; i++){
            total += Arrays.asList(array).indexOf(i);
        }
        return total;
    }

    int t;
    public int get(int index) {
        for (int i = 0; i < 5; i++){
            t = Arrays.asList(array[index]).indexOf(i);;
        }
        return t;
    }

}
