import java.util.Arrays;

public class MyQueue<T> {
    int index;
    public Object [] array;;
    int size;


    public MyQueue(int size, Object[] array){
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
    public int size(){
        for (int i = 0; i < array.length; i++){
            total += Arrays.asList(array).indexOf(i);
        }
        return total;
    }


    public Object peek() {
        return array[0];
    }

    //poll() возвращает первый элемент в очереди и удаляет его из коллекции

    public Object poll() {
        array[0] = null;
        return array[0];
    }


    public void print() {
        for (Object element : array) {
            System.out.print("" + element + " ");
        }
    }

}

