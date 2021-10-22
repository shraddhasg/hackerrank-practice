package com.shraddha;

class Node1 {
    int data;
    Node1 next;

    @Override
    public String toString() {
        return this.data + "";
    }
}

public class ReversedLinkedList {
    static Node1 head;

    public static Node1 createNode(int data) {
        Node1 node = new Node1();
        node.data = data;
        node.next = null;

        return node;
    }

    public static void insertNode(int data) {
        Node1 node = createNode(data);
        if (head == null) head = node;
        else {
            Node1 n = head;
            while (n.next != null) n = n.next;
            n.next = node;
        }
    }

    public static void insertAtStart(int data) {
        Node1 node = createNode(data);
        head = node;
    }

    public static void insertNodeAt(int data, int index) {
        if (index == 0) insertAtStart(data);
        else {
            Node1 node = createNode(data);
            Node1 n = head;
            for (int i = 0; i < index - 1; i++) n = n.next;
            Node1 temp = n.next;
            n.next = node;
            node.next = temp;
        }
    }

    public static Node1 deleteNode(int index) {
        if (index == 0) {
            Node1 n = head;
            head = head.next;
            return n;
        } else {
            Node1 n = head;
            for (int i = 0; i < index - 1; i++) n = n.next;
            Node1 temp = n.next;
            n.next = n.next.next;
            return temp;
        }
    }

    public static void show(Node1 n) {
//        Node1 n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void reverseLinkedList(Node1 n) {
        Node1 prev = null, curr = n, nex = null;

        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        show(prev);
    }

    public static Node1 reverseLinkedListUsingRecursion(Node1 n, Node1 prev) {
        Node1 head1 = null;
        if (n.next == null) {
            head1 = n;
            n.next = prev;
            return head1;
        }
        Node1 nextNode = n.next;
        n.next = prev;
//        prev = n;
//        n = nextNode;
        reverseLinkedListUsingRecursion(nextNode, n);
        return head1;
    }

    public static void main(String[] args) {
        insertNodeAt(342, 0);
        insertNodeAt(52, 1);
        insertNodeAt(4, 2);
        insertNodeAt(2, 3);
        insertNodeAt(8, 4);
        System.out.println("All nodes = ");
        show(head);
        System.out.println("Deleted node = " + deleteNode(3));
        System.out.println("After deletion nodes = ");
        show(head);
        System.out.println("Reverse Linked List = ");
        reverseLinkedList(head);
//        System.out.println("Reverse Linked List using Recursion = ");
//        Node1 newNode = reverseLinkedListUsingRecursion(head, null);
//        show(newNode);
    }
}
