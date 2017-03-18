import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

/**
 * Created by дшшр on 18.03.2017.
 */
public class LinkedSet implements Set {

    public LinkedSet() {
        head = new Node();
        end = new Node();
        head.setNextNode(end);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    @Override
    public boolean contains(Object o) {
        boolean result = false;
        Node currentNode = new Node(head.getNode());
        for (int i = 0; i < size; i++) {
            if (currentNode.getNode().equals(o)) {
                result = true;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {

        if (size == 0) {
            head.setNode(o);
            return true;
        }
        if (!contains(0)) {
            ++size;
            end.setNextNode(new Node(o));
            end = end.getNextNode();
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        c.forEach(o ->
                add(o));
        return true;
    }

    @Override
    public void clear() {
        head = new Node();
        end = new Node();

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] result = new Object[size];
        Node currentNode = new Node(head.getNode(), head.getNextNode());
        for (int i = 0; i < size; i++) {
            result[i] = currentNode.getNode();
            currentNode = currentNode.getNextNode();
        }
        return result;
    }

    private Node head;
    private Node end;
    private int size;
}
