public class MyHashMap<T, K> {
    private int size;
    private NodeForHash<T, K> start;

    // добавляет пару ключ + значение
    public boolean put(T key, K value) {
        if (!isExist(key)) {
            if (start == null)
                start = new NodeForHash<>(key, value, null);
            else {
                NodeForHash<T, K> tempNode = start;

                while (tempNode.getNext() != null)
                    tempNode = tempNode.getNext();

                tempNode.setNext(new NodeForHash(key, value, null));
            }

            size++;
            return true;
        }

        return false;
    }

    // удаляет пару по ключу
    public boolean remove(T key) {
        if (isExist(key)) {
            NodeForHash<T, K> prevNode = null;
            NodeForHash<T, K> nodeForRemove = start;

            while (nodeForRemove.getNext() != null) {
                if (nodeForRemove.getKey() == key)
                    break;

                prevNode = nodeForRemove;
                nodeForRemove = nodeForRemove.getNext();
            }

            if (prevNode == null)
                start = nodeForRemove.getNext();
            else
                prevNode.setNext(nodeForRemove.getNext());

            nodeForRemove.setNext(null);
            nodeForRemove.setKey(null);
            nodeForRemove.setValue(null);

            size--;
            return true;
        }

        return false;
    }

    // очищает коллекцию
    public void clear() {
        // очищаем все ссылки
        for (NodeForHash<T, K> tempNode = start; tempNode != null; ) {
            NodeForHash<T, K> nextNode = tempNode.getNext();
            tempNode.setNext(null);
            tempNode.setKey(null);
            tempNode.setValue(null);
            tempNode = nextNode;
        }
        start = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает значение(K value) по ключу
    public K get(T key) {
        if (start != null) {
            return getNode(key).getValue();
        }

        return null;
    }

    // проверка на наличие в списке
    public boolean isExist(T key) {
        if (getNode(key) != null)
            return true;

        return false;
    }

    // возвращает Node по ключу
    public NodeForHash<T, K> getNode(T key) {
        if (start != null) {
            NodeForHash<T, K> tempNode = start;

            while (tempNode != null) {
                if (tempNode.getKey() == key)
                    return tempNode;

                tempNode = tempNode.getNext();
            }
        }

        return null;
    }

    // возвращает Node по ключу
    public NodeForHash<T, K> getNode(int index) {
        if (index >= 0 && index < size) {
            return recursiveGet(start, 0, index);
        }

        return null;
    }

    // рекурсивный поиск по индексу
    private NodeForHash<T, K> recursiveGet(NodeForHash<T, K> node, int point, int index) {
        if (point != index)
            return recursiveGet(node.getNext(), point + 1, index);
        else return node;
    }
}
