package org.example;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(Node node) {
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        size++;
    }

    public void addFirst(Node node) {
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.setNext(this.head);
            this.head = node;
        }
        this.size++;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getSize() {
        return this.size;
    }

    public void addIndex(Node node, int index) {
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        }

        if (index == 0) {
            this.addFirst(node);
        } else if (index == this.size) {
            this.add(node);
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.size; i++) {
                if (i + 1 == index) {
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    break;
                }
                temp = temp.getNext();
                this.size++;
            }
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getValue() + " --> ");
            node = node.getNext();
        }
        System.out.println("null");
    }

    public void deleteLast() {
        if (this.size == 0) {
            return;
        } else if (this.size == 1) {
            this.head.setNext(null);
            this.head = null;
            this.tail = null;

            this.size--;
        } else {
            Node temp = this.head;
            while (temp != null) {
                if (temp.getNext().equals(this.tail)) {
                    temp.setNext(null);
                    this.tail = temp;
                }
                temp = temp.getNext();

            }
            this.size--;
        }

    }

    public void removeIndex(int index) {
        if (this.size == 0) {
            return;
        } else if (this.size == 1) {
            this.head.setNext(null);
            this.head = null;
            this.tail = null;

            this.size--;
        } else {
            Node node = this.head;
            for (int i = 0; i < this.size; i++) {
                if (i + 1 == index) {
                    node.setNext(node.getNext().getNext());
                }

                if (node != null) {
                    node = node.getNext();
                }

            }
            this.size--;
        }
    }

    public void rev() {
        Node prev = null;
        Node curr = this.head;

        while (curr != null) {
            Node temp = curr.getNext();
            curr.setNext(prev);

            prev = curr;
            curr = temp;

        }

        this.head = prev;

    }

}
