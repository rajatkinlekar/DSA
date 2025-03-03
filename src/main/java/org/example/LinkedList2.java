package org.example;

import java.util.Stack;

public class LinkedList2 {
    int size;
    ListNode head;

    public void addNode(ListNode node) {
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addChild(ListNode node, LinkedList2 list) {
        if (list.head != null) {
            node.child = list.head;
        }
    }

    public void display() {
        if (this.head == null) {
            System.out.println("null");
        } else {
            ListNode temp = this.head;
            while (temp.next != null) {

                System.out.print(temp.val + " --> ");

                temp = temp.next;
            }

        }
    }

    public ListNode flatten() {
        if (head == null) {
            return null;
        }

        ListNode temp = this.head;

        Stack<ListNode> stack = new Stack<>();

        while (temp != null) {
            if (temp.child != null) {
                if (temp.next != null) {
                    stack.push(temp.next);
                }
                temp.next = temp.child;
                temp.child = null;
            } else if (temp.next == null && !stack.isEmpty()) {
                temp.next = stack.pop();
            }
            temp = temp.next;


        }

//        while (!stack.isEmpty()) {
//            temp.next = stack.pop();
//
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//
//        }

        return this.head;
    }
}
