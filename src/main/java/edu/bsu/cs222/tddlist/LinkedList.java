package edu.bsu.cs222.tddlist;

import org.w3c.dom.Node;

public class LinkedList<T> {
    private int size = 0;
    private Node first;

    public int size() {
        return size;
    }

    public void add(T value) {
        size++;
        if(null == first) {
            first = new Node(value);
        } else {
            Node temp = first;
            while (null != temp.next) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    public T get(int index) {
        Node node = first;
        while (index > 0) {
            index--;
            node = node.next;
        }
        return node.value;
    }

    private class Node {
        private final T value;
        private Node next;
        public Node(T value) {
            this.value = value;
        }
    }
}
