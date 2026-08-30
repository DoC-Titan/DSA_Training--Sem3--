package Day16.LinkedList;

class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    private int size;
    private Node head;
    private Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data){

        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }


    public int delFirst(){
        int value;
        if(head == null){
            throw new RuntimeException("Stack is Empty");
        }
        value = head.data;

        if(tail == head){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
        return value;
    }

    public int delLast() {
        int value;
        if(head == null){
            throw new RuntimeException("Stack is Empty");
        }
        value = tail.data;

        if(tail == head){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return value;
    }

    public void printFL(){
        Node current = head;
        System.out.print("[");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");

    }


    public void printLF(){
        Node current = tail;
        System.out.print("[");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println("]");

    }
    public int size(){
        return size;
    }

    public static void main(String[] args){
        DoublyLinkedList D1 = new DoublyLinkedList();
        D1.addFirst(19);
        D1.addFirst(45);
        D1.addFirst(79);
        D1.addFirst(41);
        D1.addFirst(22);
        D1.printFL();
        D1.printLF();

        D1.delFirst();
        D1.delFirst();
        D1.delLast();
        D1.printFL();
        D1.printLF();


    }
}
