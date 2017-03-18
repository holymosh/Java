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

    public Node getNextNode() {
        return nextNode;
    }

    public void setNode(T Node) {
        this.value = Node;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
