package edu.bsu.cs222.tddlist;

import org.w3c.dom.Node;

public class LinkedList<T> {

    private Node first;

    public int size() {
        int count = 0;
        Node node = first;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public void add(T value) {
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

    public T remove(int index) {
        Node prev = null;
        Node node = first;
        while (index > 0) {
            index--;
            prev = node;
            node = node.next;
        }
        if (null == prev) {
            first = node.next;
        } else {
            prev.next = node.next;
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
