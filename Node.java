package Jobsheet12;

public class Node {
    Mahasiswa data;
    Node prev;
    Node next;

    public Node(Node prev, Mahasiswa data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}