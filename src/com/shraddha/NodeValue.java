package com.shraddha;

import static com.shraddha.LinkedListOperation.show;
import static com.shraddha.ReversedLinkedList.head;
import static com.shraddha.ReversedLinkedList.insertNodeAt;

public class NodeValue {
    public static int getLengthOfLL(Node1 head) {
        int lengthOfLL = 0;
        while (head != null) {
            lengthOfLL++;
            head = head.next;
        }
        return lengthOfLL;
    }

    public static int getNode(Node1 llist, int positionFromTail) {
        int count = 0;

        int val = getLengthOfLL(llist) - positionFromTail;
        while (llist != null) {
            count++;
            if (count == val) return llist.data;
            llist = llist.next;
        }
        return 0;
    }

    public static void show(Node1 n) {
//        Node1 n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        insertNodeAt(3, 0);
        insertNodeAt(2, 1);
        insertNodeAt(1, 2);

        System.out.println("List = ");
        show(head);
        int ans = getNode(head, 2);
        System.out.println("Value = " + ans);
    }
}
