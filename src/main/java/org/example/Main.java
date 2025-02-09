package org.example;

public class Main {
    public static void main(String[] args) {
        Node node_1 = new Node(5);
        Node node_2 = new Node(5);
        Node node_3 = new Node(5);
        Node node_x = new Node(2);
        Node node_xx = new Node(5);
        Node node_xxx = new Node(7);
        Node node_4 = new Node(5);
        Node node_5 = new Node(7);

        LinkedList list = new LinkedList();

        list.add(node_1);
        list.add(node_2);
        list.add(node_3);
        list.add(node_x);
        list.add(node_xx);
        list.add(node_xxx);
        list.add(node_4);
        list.add(node_5);

//        list.addFirst(node_x);
//        list.addFirst(node_xx);
//
//        list.addIndex(node_xxx, 2);
//        list.deleteLast();

 //       list.removeIndex(2);

// //       list.rev();
//        list.display();
//
//        list.removeElements(7);

        list.recDisplay(node_1);
        System.out.println("--------------------------");
        list.display();


    }
}