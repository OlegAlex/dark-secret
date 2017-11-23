public class MyQueue<T> {
    private MyNode<T> head; // первый в очереди
    private int size;

    // добавляет элемент в конец
    public void add(T value) {
        if (head == null)
            head = new MyNode<>(null, value, null);
        else {
            MyNode<T> tempNode = head;

            // идём в конец очереди
            while (tempNode.getNext() != null)
                tempNode = tempNode.getNext();

            tempNode.setNext(new MyNode<>(null, value, null));
        }

        size++;
    }

    // удаляет элемент под индексом
    public boolean remove(int index) {
        if (index == 0 && index < size) {
            poll();

            return true;
        }

        if (index > 0 && index < size) {
            MyNode<T> prevNode = recursiveGet(head, 0, index - 1);
            MyNode<T> nodeForRemove = prevNode.getNext();
            MyNode<T> nextNode = nodeForRemove.getNext();

            prevNode.setNext(nextNode);
            nodeForRemove.setNext(null);

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
        for (MyNode<T> tempNode = head; tempNode != null; ) {
            MyNode<T> nextNode = tempNode.getNext();
            tempNode.setItem(null);
            tempNode.setNext(null);
            tempNode = nextNode;
        }
        head = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает первый элемент в очереди (FIFO)
    public T peek() {
        if (head != null)
            return head.getItem();

        return null;
    }

    //возвращает первый элемент в очереди и удаляет его из коллекции
    public T poll() {
        T result = null;

        if (head != null) {
            result = head.getItem();

            if (head.getNext() == null) {
                head.setItem(null);
                head = null;
            } else {
                MyNode<T> tempNode = head;
                head = head.getNext();
                tempNode.setItem(null);
                tempNode.setNext(null);
            }

            size--;
        }

        return result;
    }

    // рекурсивный поиск по индексу
    private MyNode<T> recursiveGet(MyNode<T> node, int point, int index) {
        if (point != index)
            return recursiveGet(node.getNext(), point + 1, index);
        else return node;
    }

    // возвращает элемент под индексом
    public T get(int index) {
        if (index >= 0 && index < size)
            return recursiveGet(head, 0, index).getItem();

        return null;
    }
}
