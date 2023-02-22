package LinckedListRealisation;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterator<Node<User>> {
    private Node<User> current;

    public MyLinkedList(Node<User> first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node<User> next() {
        Node<User> temp = current;
        current = current.getNext();
        return temp;
    }

}
