/**
 * Created by дшшр on 18.03.2017.
 */
public class Node<T> {
    private T Node;
    private Node nextNode;

    public Node(){

    }
    public Node(T node) {
        Node = node;
    }

    public Node(T node, Node nextNode) {
        this(node);
        this.nextNode = nextNode;
    }

    public T getNode() {
        return Node;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNode(T Node) {
        this.Node = Node;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
