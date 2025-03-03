package org.example;

public class Main {
    public static void main(String[] args) {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        ListNode node_7 = new ListNode(7);
        ListNode node_8 = new ListNode(8);


        LinkedList2 list = new LinkedList2();
        LinkedList2 list2 = new LinkedList2();

        list.addNode(node_1);
        list.addNode(node_2);
        list.addNode(node_3);
        list.addNode(node_4);
        list.addNode(node_5);
        // -----------------------
        list2.addNode(node_6);
        list2.addNode(node_7);
        list2.addNode(node_8);

        list.addChild(node_3, list2);

        list.display();

        list.flatten();
        list.display();


    }
}