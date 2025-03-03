package org.example;

public class Node {
    private int value;
    private Node next;
    private Node previous;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node() {
        this.value = 0;
        this.setNext(null);
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
