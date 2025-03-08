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

    public Node addTwoNumbers(Node l1, Node l2) {
        int sum = 0;
        int carry = 0;
        Node dummy = new Node(0);
        Node temp = new Node(0);
        dummy.setNext(temp);

        while (l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                sum = l1.getValue() + l2.getValue() + carry;
                carry = sum > 9 ? sum%10 : sum;
                sum = sum > 9 ? sum/10 : sum;

                l1 = l1.getNext();
                l2 = l2.getNext();
            }

            if (l1 != null && l2 == null) {
               sum = l1.getValue() + carry;
               carry = sum > 9 ? sum%10 : sum;
               sum = sum > 9 ? sum/10 : sum;

               l1 = l1.getNext();
            }

            if (l1 == null && l2 != null) {
                sum = l2.getValue() + carry;
                carry = sum > 9 ? sum%10 : sum;
                sum = sum > 9 ? sum/10 : sum;

                l2 = l2.getNext();
            }


            Node node = new Node(sum);
            temp.setNext(node);
            temp = node;

        }

        if (temp.getValue() > 9) {
            Node node = new Node(carry);
            temp.setNext(node);
        }

        return dummy.getNext();
    }



}
