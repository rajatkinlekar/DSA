package org.example;

public class Main {
    public static void main(String[] args) {
        Node node_1 = new Node(9);
        Node node_2 = new Node(9);
        Node node_3 = new Node(9);
        Node node_4 = new Node(9);

        LinkedList list = new LinkedList();

        list.add(node_1);
        list.add(node_2);
        list.add(node_3);
        list.add(node_4);

        list.display();
        list.addOne(node_1);
        list.display();


    }
}