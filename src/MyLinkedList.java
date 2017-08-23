import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.util.NoSuchElementException;

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
        size++;
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

    public int size(){
        return size;
    }

    /*public void remove(int index){
        Node<T> nodeRemove = getNode(index);
       if (nodeRemove != first){
            nodeRemove.prev.next = nodeRemove.next;
        } else {
            first = nodeRemove.next;
        }
        if (nodeRemove != last){
            nodeRemove.next.prev = nodeRemove.prev;
        } else {
            last = nodeRemove.prev;
        }
        nodeRemove = null;
        size--;
    }*/
  /*public void remove(T item){
      Node<T> currentNode = first;
      Node<T> previousNode = null;
      while(currentNode != null){
          if(item.equals(currentNode.item)){
              if(previousNode  == null) {
                  first = currentNode.next;
              }
              else {
                  previousNode.next = currentNode.next;
              }
              size--;
          }
          else {
              previousNode = currentNode;
          }
          currentNode = currentNode.next;
      }

  }*/

    /*public void remove(int index)
    {
        Node<T> currNode = first;
            for (int i = 0; i < index; i++) {
                currNode = currNode.next;
            }
            Node<T> temp = currNode;
            currNode = temp.getPrevNode();
            currNode.setNextNode(temp.getNextNode());
            temp = null;
            size--;


    }*/


    /*public void clear(){
        int originalSize = size;
        for (int i = 0; i < originalSize; i++){
            remove(0);
        }
    }*/

    public Node<T> getNode(int index){
            Node<T> iterator = first;
            if (iterator == null) return null;
            for (int i = 0; i < index; i++){
                iterator = iterator.next;
            }
            return iterator;
               }

    public T get(int index){
        return getNode(index).item;
    }


}