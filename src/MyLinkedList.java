import javax.xml.soap.Node;
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
    public T item;
    public MyLinkedList<T> next;
    public MyLinkedList<T> prev;

    Object data;
    MyLinkedList(Object d,Node n) {
        data = d;
        next = n;
    }
}
