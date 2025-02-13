package org.example;

public class Main {
    public static void main(String[] args) {
        Node node_1 = new Node(4);
        Node node_2 = new Node(2);
        Node node_3 = new Node(1);
        Node node_4 = new Node(3);

        LinkedList list = new LinkedList();

        list.add(node_1);
        list.add(node_2);
        list.add(node_3);
        list.add(node_4);

        list.display();
        list.sortList();
        list.display();


    }
}