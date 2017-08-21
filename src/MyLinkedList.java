
/*Написать свой класс MyLinkedList как аналог классу LinkedList.
Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода)
 который хранит ссылку на прошлый и следующий элемент коллекции(двусвязный список).
Методы
add(T value) добавляет элемент в конец
remove(int index) удаляет элемент под индексом
clear() очищает коллекцию
size() возвращает размер коллекции
get(int index) возвращает элемент под индексом
*/
public class MyLinkedList<T> {
    Node<T> first;
    Node<T> last;
    int size;


    public MyLinkedList(){
        first = new Node<T>(null, null, null);
        last = first;
        size = 0;
    }

    public void add(T item) {
        Node<T> node = new Node<>(item, null, last);
        last.next = node;
        last = node;
    }

    public void show() {
        Node<T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("" + iterator.item + " ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();
    }
}