package tech.dobler.adproblems;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public LinkedList() {
    }

    public void linkLast(T elem) {
        Node nodeToAdd =  new Node<>(elem, null, null);

        if (first == null)
            first = nodeToAdd;
        else if (last == null)
            last = nodeToAdd;
        else {
            nodeToAdd.prev = last;
            last.next = nodeToAdd;
            last = nodeToAdd;
        }

        size++;
    }

    public void linkFirst(T elem) {
        Node nodeToAdd =  new Node<>(elem, null, null);

        if (first == null)
            first = nodeToAdd;
        else {
            nodeToAdd.next = first;
            first.prev = nodeToAdd;
            first = nodeToAdd;
        }

        size++;
    }


    private static class Node<T> {
        T elem;
        Node prev;
        Node next;

        Node(T elem, Node prev, Node next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }
}
