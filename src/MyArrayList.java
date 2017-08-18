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
    public Object remove(int index){
        for (int i = 0; i < array.length; i++) {
            array[index] = null;

        }
        return array;
    }

    //clear() очищает коллекцию
    public Object clear(){
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        return array;
    }

    //size() возвращает размер коллекции
    int total=0;
    public Object size(){
        for (int i = 0; i < array.length; i++){
            total += Arrays.asList(array).indexOf(i);
        }
        return total;
    }

    int t;
    public Object get(int index) {

        return array[index];
    }

}
