package com.shraddha;

class Node {
    int data;
    Node next;


    @Override
    public String toString() {
        return this.data + "";
    }
}

public class LinkedListOperation {
    static Node head;

    public static Node createNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        return node;
    }

    public static void insert(int data) {
        Node node = createNode(data);
        if (head == null) head = node;
        else {
            Node n = head;
            while (n.next != null) n = n.next;
            n.next = node;
        }
    }

    public static void insertNodeAtStart(int data) {
        Node node = createNode(data);
        node.next = head;
        head = node;
    }

    public static void insertAt(int data, int index) {

        if (index == 0) insertNodeAtStart(data);
        else {
            Node node = createNode(data);
            Node n = head;
            for (int i = 0; i < index - 1; i++) n = n.next;
            node.next = n.next;
            n.next = node;

        }
    }

    public static Node deleteAt(int index) {
        Node n = head;
        Node temp = head;
        if (index == 0) n = head;
        else {
            for (int i = 0; i < index - 1; i++) n = n.next;
            temp = n.next;
            n.next = temp.next;
        }
        return temp;
    }

    public static void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        insertAt(11, 0);
        insertAt(33, 1);
        insertAt(44, 2);
        insertAt(12, 3);
        insertAt(55, 4);
        System.out.println("All nodes = ");
        show();
        Node node = deleteAt(4);
        System.out.println("Deleted node = " + node.toString());
        System.out.println("After deletion nodes = ");
        show();
    }
}
