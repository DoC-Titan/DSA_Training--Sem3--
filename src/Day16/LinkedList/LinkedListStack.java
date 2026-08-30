package Day16.LinkedList;

public class LinkedListStack {


    private Node head;
    private int size;

    // ---------- ADD FIRST ----------
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // ---------- ADD LAST ----------
    public void addLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {          // empty list
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {   // traverse to last node
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // ---------- DELETE FIRST ----------
    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // ---------- DELETE LAST ----------
    public int deleteLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value;

        if (head.next == null) {      // only one node
            value = head.data;
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {   // stop at second-last node
                current = current.next;
            }
            value = current.next.data;
            current.next = null;      // remove last node
        }
        size--;
        return value;
    }

    // ---------- Helper methods ----------
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        stack.printList();          // [ 30 20 10 ]

        stack.addLast(1);
        stack.printList();          // [ 30 20 10 1 ]

        System.out.println("Deleted first: " + stack.deleteFirst()); // 30
        stack.printList();          // [ 20 10 1 ]

        System.out.println("Deleted last: " + stack.deleteLast());   // 1
        stack.printList();          // [ 20 10 ]

        System.out.println("Size: " + stack.size());  // 2
    }

}

