package Day3;



    public class IntStack {

        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node top;
        private int size;

        public void push(int value) {
            Node node = new Node(value);
            node.next = top;
            top = node;
            System.out.println(top + "pushed to the stack");
            size++;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = top.data;
            top = top.next;
            size--;
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int size() {
            return size;
        }

        public static void main(String[] args) {
            IntStack stack = new IntStack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.pop();
            stack.peek();

            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.size());
        }
    }






