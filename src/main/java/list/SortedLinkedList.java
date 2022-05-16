package list;

public class SortedLinkedList<S extends Comparable<S>> implements SortedList<S> {
    Node<S> head;
    int size = 0;

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(S element) {
        if (isEmpty()) {
            head = new Node<S>(element);
        } else {
            Node<S> newNode = new Node<S>(element);
            if (newNode.getValue().compareTo(head.getValue()) < 0) { // if added is before first
                newNode.next = head;
                head = newNode;
            } else {
                Node<S> current = head;
                Node<S> prev = head;

                while (current != null && newNode.getValue().compareTo(prev.getValue()) >= 0) {
                    prev = current;
                    current = current.next;
                }
                prev.setNext(newNode); // loop if first
                newNode.setNext(current);
            }
        }
        size++;

    }

    @Override
    public boolean delete(int index) {
        Node<S> current = head;
        Node<S> prev = head;
        int count = 0;

        while (current.next != null && count < index) {
            prev = current;
            current = current.next;
            count++;
        }
        prev.setNext(current.next);
        size--;

        return true;
    }

    @Override
    public S get(int index) {
        Node<S> current = head;
        int count = 0;

        while (current.next != null && count < index) {
            current = current.next;
        }
        return current.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<S> current = head;

        while (current != null) {
            sb.append(current.getValue().toString());
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    private class Node<S> {
        private final S value;
        private Node<S> next;

        public Node(S value) {
            this.value = value;
        }

        public S getValue() {
            return value;
        }

        public void setNext(Node<S> next) {
            this.next = next;
        }
    }
}