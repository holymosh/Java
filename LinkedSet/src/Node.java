/**
 * Created by дшшр on 18.03.2017.
 */
public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(){

    }
    public Node(T node) {
        value = node;
    }


    public Node(T node, Node nextNode) {
        this(node);
        this.nextNode = nextNode;
    }

    public T getNode() {
        return value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNode(T Node) {
        this.value = Node;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node <?> node = (Node <?>) o;

        if (value != null ? !value.equals(node.value) : node.value != null) return false;
        return nextNode != null ? nextNode.equals(node.nextNode) : node.nextNode == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (nextNode != null ? nextNode.hashCode() : 0);
        return result;
    }
}
