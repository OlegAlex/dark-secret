public class NodeForHash<T, K> {
    private T key;
    private K value;
    private NodeForHash next;

    public NodeForHash(T key, K value, NodeForHash next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public NodeForHash getNext() {
        return next;
    }

    public void setNext(NodeForHash next) {
        this.next = next;
    }
}