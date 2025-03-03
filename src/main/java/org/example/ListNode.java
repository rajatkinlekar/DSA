package org.example;

public class ListNode {
    int val;
    ListNode next;
    ListNode child;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
        //
    }

    public ListNode(int val, ListNode next, ListNode child) {
        this.val = val;
        this.next = next;
        this.child = child;
    }
}
