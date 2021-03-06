import java.util.*;

public class LinkedSet<T> implements Set {

    public LinkedSet() {
        head = new Node<T>();
        end = new Node<T>();
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
        Node<T> currentNode = new Node<T>(head.getNode());
        for (int i = 0; i < size; i++) {
            if (currentNode.getNode().equals(o)) {
                result = true;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return new LinkedSetIterator(head,end,size);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {

        if (size == 0) {
            head.setNode((T) o);
            ++size;
            return true;
        }
        if (!contains(o)) {
            ++size;
            end.setNextNode(new Node<T>((T) o));
            end = end.getNextNode();
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        boolean result = false;
        Node<T> currentNode = new Node <T>(head.getNode(),head.getNextNode());
        Node<T> nodeBeforeCurrnet = head;
        if (head.equals(o)){
            head = head.getNextNode();
            return true;
        }
        Node<T> nodeBeforeCurrent = currentNode;
        for (int i = 1; i < size-1; i++) {
            if (currentNode.equals(o)){
               nodeBeforeCurrent.setNextNode(currentNode.getNextNode());
               return true;
            }
            nodeBeforeCurrent = currentNode;
            currentNode = currentNode.getNextNode();
        }
        if (end.equals(o)){
            --size;
        }
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
        head = new Node<T>();
        end = new Node<T>();

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public boolean removeAll(Collection c) {
        c.forEach(o -> remove(o));
        return true;
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
        Node<T> currentNode = new Node<T>(head.getNode(), head.getNextNode());
        for (int i = 0; i < size; i++) {
            result[i] = currentNode.getNode();
            currentNode = currentNode.getNextNode();
        }
        return result;
    }

    private Node<T> head;
    private Node<T> end;
    private int size;
}
