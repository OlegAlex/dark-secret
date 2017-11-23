public class MyLinkedList<T> {
    private MyNode<T> first;    // начало коллекции
    private MyNode<T> last;     // конец коллекции
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    // добавляет элемент в конец
    public void add(T value) {
        MyNode<T> lastNode = last;
        MyNode<T> tempNode = new MyNode<>(last, value, null);
        last = tempNode;

        if (lastNode == null)
            first = tempNode;
        else
            lastNode.setNext(tempNode);

        size++;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            MyNode<T> nodeForRemove = recursiveGet(first, 0, index);
            MyNode<T> prevNode = nodeForRemove.getPrev();
            MyNode<T> nextNode = nodeForRemove.getNext();

            //если первый
            if (prevNode == null) {
                first = nextNode;
            } else {
                prevNode.setNext(nextNode);
                nodeForRemove.setPrev(null);
            }

            // если последний
            if (nextNode == null) {
                last = prevNode;
            } else {
                nextNode.setPrev(prevNode);
                nodeForRemove.setNext(null);
            }

            // чистим
            nodeForRemove.setItem(null);
            size--;

            return true;
        }
        return false;
    }

    // очищает коллекцию
    public void clear() {
        // очищаем все ссылки
        for (MyNode<T> tempNode = first; tempNode != null; ) {
            MyNode<T> nextNode = tempNode.getNext();
            tempNode.setItem(null);
            tempNode.setNext(null);
            tempNode.setPrev(null);
            tempNode = nextNode;
        }
        first = last = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает элемент под индексом
    public T get(int index) {
        if (index >= 0 && index < size)
            return recursiveGet(first, 0, index).getItem();

        return null;
    }

    // рекурсивный поиск по индексу
    private MyNode<T> recursiveGet(MyNode<T> node, int point, int index) {
        if (point != index)
            return recursiveGet(node.getNext(), point + 1, index);
        else return node;
    }
}
