package org.example;

public class Main {
    public static void main(String[] args) {
        Node node_1 = new Node(1);
        Node node_2 = new Node(2);
        Node node_3 = new Node(3);
        Node node_4 = new Node(5);
//        Node node_5 = new Node(5);
        Node node_6 = new Node(5);
        Node node_7 = new Node(6);
        Node node_8 = new Node(4);
        Node node_9 = new Node(9);

        LinkedList l1 = new LinkedList();
//        LinkedList l2 = new LinkedList();
//        LinkedList l3 = new LinkedList();

        l1.add(node_1);
        l1.add(node_2);
        l1.add(node_3);
        l1.add(node_4);

        l1.display();
        l1.swapPairs();
        l1.display();




//        list.addChild(node_3, list2);
//
//        list.display();
//
//        list.flatten();
//        list.display();


    }
}