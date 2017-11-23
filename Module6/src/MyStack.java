public class MyStack<T> {
    private MyNode<T> tail; // последний в стеке
    private int size;

    // добавляет элемент в конец
    public void push(T value) {
        if (tail == null)
            tail = new MyNode<>(null, value, null);
        else {
            MyNode<T> tempNode = new MyNode<>(tail, value, null);
            tail = tempNode;
        }

        size++;
    }

    // удаляет элемент под индексом
    public boolean remove(int index) {
        if (index == 0 && index < size) {
            pop();

            return true;
        }

        if (index > 0 && index < size) {
            MyNode<T> prevNode = recursiveGet(tail, 0, index - 1);
            MyNode<T> nodeForRemove = prevNode.getPrev();
            MyNode<T> nextNode = nodeForRemove.getPrev();

            prevNode.setPrev(nextNode);
            nodeForRemove.setPrev(null);

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
        for (MyNode<T> tempNode = tail; tempNode != null; ) {
            MyNode<T> nextNode = tempNode.getPrev();
            tempNode.setItem(null);
            tempNode.setPrev(null);
            tempNode = nextNode;
        }
        tail = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает первый элемент в стеке (LIFO)
    public T peek() {
        if (tail != null)
            return tail.getItem();
        return null;
    }

    // возвращает первый элемент в стеке и удаляет его из коллекции
    public T pop() {
        T result = null;

        if (tail != null) {
            result = tail.getItem();

            if (tail.getPrev() == null) {
                tail.setItem(null);
                tail = null;
            } else {
                MyNode<T> tempNode = tail;
                tail = tail.getPrev();
                tempNode.setItem(null);
                tempNode.setPrev(null);
            }

            size--;
        }

        return result;
    }

    // рекурсивный поиск по индексу
    private MyNode<T> recursiveGet(MyNode<T> node, int point, int index) {
        if (point != index)
            return recursiveGet(node.getPrev(), point + 1, index);
        else return node;
    }

    // возвращает элемент под индексом
    public T get(int index) {
        if (index >= 0 && index < size)
            return recursiveGet(tail, 0, index).getItem();

        return null;
    }
}
