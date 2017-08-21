import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {   //далее вместо Т будет подставляться класс
    int index;
    public Object [] array;;
    int size;


    public MyArrayList(int size, Object[] array){
        this.array = array;
        this.size  = size;
    }


    public void add(T value ){

        Object[] arrayBigger = new Object[array.length + 1];
        System.arraycopy(array, 0, arrayBigger, 0, array.length);
        int t = arrayBigger.length-1;
        arrayBigger [t] = value;
        array = arrayBigger;
        size++;
    }

    //remove(int index) удаляет элемент под индексом
    public void remove(int index){
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
    public void size(){
        for (int i = 0; i < array.length; i++){
            total += Arrays.asList(array).indexOf(i);
        }
    }


    public Object get(int index) {
        return array[index];
    }

}
