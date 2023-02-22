package LinckedListRealisation;

import java.util.Iterator;

public class OwnList<T> implements Iterable<Node<User>> {
    private Node<User> first;
    private Node<User> last;

    public OwnList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T data) {
        Node<User> temp = new Node<>();
        temp.setData((User) data);
        temp.setNext(null);

        if (first == null) {
            temp.setPrev(null);
            first = last = temp;
        } else {
            temp.setPrev(last);
            last.setNext(temp);
            last = temp;
        }
    }

    @Override
    public Iterator<Node<User>> iterator() {
        return new MyLinkedList<User>(first);
    }
}
