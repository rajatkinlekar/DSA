package org.example;

public class Main {
    public static void main(String[] args) {
        Node node_1 = new Node(1);
        Node node_2 = new Node(1);
        Node node_3 = new Node(2);
        Node node_x = new Node(3);
        Node node_xx = new Node(5);
        Node node_xxx = new Node(7);
        Node node_4 = new Node(3);
        Node node_5 = new Node(7);

        LinkedList list = new LinkedList();

        list.add(node_1);
        list.add(node_2);
        list.add(node_3);
        list.add(node_4);
        list.add(new Node(3));
       // list.recursiveInsertNode(node_4, 0, node_1);

        //       list.recursiveReverse(node_1);



        list.display();
        list.recursiveRemoveDuplicates(node_1);
        list.display();
//        System.out.println("Head = " + list.getHead().getValue());


    }
}