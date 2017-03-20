import java.util.Iterator;

/**
 * Created by дшшр on 20.03.2017.
 */
public class LinkedSetIterator<T> implements Iterator {

    private Node<T> head;
    private Node<T> end;
    private Node<T> current;
    private int size;

    public LinkedSetIterator(Node <T> head, Node <T> end, int size) {
        this.head = head;
        this.end = end;
        this.size = size;
        current = head;
    }

    @Override
    public boolean hasNext() {
        return current.equals(end)? true:false;
    }

    @Override
    public Object next() {
        current = current.getNextNode();
        return current;
    }

}
