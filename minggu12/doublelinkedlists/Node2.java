package doublelinkedlists;

public class Node2 {
    int data;
    Node2 prev, next;

    Node2(Node2 prev, int data, Node2 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}