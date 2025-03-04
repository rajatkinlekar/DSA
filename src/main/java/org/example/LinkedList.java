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

    public void recDisplay(Node temp) {
        // base condition
        if (temp == null) {
            System.out.println("null");
            return;
        }

        System.out.print(temp.getValue() + " --> ");
        recDisplay(temp.getNext());
    }

    public Node recursiveInsertNode(Node node, int index, Node iterator) {
        if (index == 0) {
            node.setNext(iterator);

            // If this is the first call, update head
            if (iterator == this.head) {
                this.head = node;
            }

            this.size++;
            return node;
        }

        iterator.setNext(recursiveInsertNode(node, index - 1, iterator.getNext()));

        return iterator;
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

    public void removeElements(int val) {

        int i = 0;

        // empty list
        if (this.head == null) {
            return;
        }

        Node iterator = this.head;
        Node temp = null;

        while (iterator.getNext() != null) {
            if (iterator.getValue() != val) {

                if (i == 0) {
                    this.head = iterator;
                }

                temp = iterator.getNext();
                while (temp != null) {
                    if (temp.getValue() != val) {
                        iterator.setNext(temp);
                        iterator = temp;
                        break;
                    }
                    temp = temp.getNext();
                }
                i++;
            } else {
                iterator = iterator.getNext();
            }


        }
    }


    public Node recursiveReverse(Node iterator) {
        if (iterator.getNext() == null) {
            this.head = iterator;
            return iterator;
        }

        recursiveReverse(iterator.getNext());

        iterator.getNext().setNext(iterator);
        iterator.setNext(null);

        return this.head;
    }

    public void removeDuplicated() {
        Node temp = this.head;

        while (temp != null && temp.getNext() != null) {
            while (temp.getNext() != null && temp.getNext().getValue() == temp.getValue()) {
                temp.setNext(temp.getNext().getNext());
                this.size--;
            }
            temp = temp.getNext();
        }
    }


    // contains errors
    public Node recursiveRemoveDuplicates(Node iterator) {
        if (iterator.getNext() == null) {
            return iterator;
        }

        Node temp = recursiveRemoveDuplicates(iterator.getNext());

        if (iterator.getValue() == temp.getValue()) {
            iterator.setNext(temp.getNext());
        }

        return iterator;
    }





}
