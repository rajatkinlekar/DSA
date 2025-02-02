package org.example;

public class Main {
    public static void main(String[] args) {
        Node node_1 = new Node(5,null);
        Node node_2 = new Node(6, null);
        Node node_3 = new Node(7, null);
        Node node_x = new Node(2, null);
        Node node_xx = new Node(3, null);
        Node node_xxx = new Node(66, null);

        LinkedList list = new LinkedList();

        list.add(node_1);
        list.add(node_2);
        list.add(node_3);

        list.addFirst(node_x);
        list.addFirst(node_xx);

        list.addIndex(node_xxx, 2);
        list.deleteLast();

        list.removeIndex(2);

        list.display();


    }
}