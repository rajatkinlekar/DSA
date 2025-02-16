package org.example;

public class Concepts {

    private int value = 0;

    public Node mergeTwoLists(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (t1 != null && t2 != null) {
            if (t1.getValue() <= t2.getValue()) {
                temp.setNext(t1);
                temp = t1;
                t1 = t1.getNext();
            } else {
                temp.setNext(t2);
                temp = t2;
                t2 = t2.getNext();
            }
        }

        // L2 > L1
        if (t1 == null) {
            temp.setNext(t2);
        } else {
            temp.setNext(t1);
        }

        return dummy.getNext();
    }



}
